package ca.mcit.bigdata.project1


import ca.mcit.bigdata.project1.enrich.{EnrichedTrip, TripRoute}
import ca.mcit.bigdata.project1.input.InputSource
import ca.mcit.bigdata.project1.model.{CalenderDate, Route, Trip}
import ca.mcit.bigdata.project1.util.Constants

object Launcher extends App {

  /**
    * File name is given by command line using option --file-name.
    * For example, --file-name=my-file.csv if the type is set to "csv" in configuration file
    */
  private val cmdLineOptions = new CommandLineOptionParser(args).parseOptions

  var tripInputSource = new InputSource(Constants.TRIPS, cmdLineOptions.trips)
  var tripFileContents: List[Trip] = tripInputSource.parseFile().asInstanceOf[List[Trip]]

  var routeInputSource = new InputSource(Constants.ROUTES, cmdLineOptions.routes)
  var routeFileContents: List[Route] = routeInputSource.parseFile().asInstanceOf[List[Route]]

  var calenderDateInputSource = new InputSource(Constants.CALENDER_DATES, cmdLineOptions.calender)
  var calenderDateFileContents: List[CalenderDate] = calenderDateInputSource.parseFile().asInstanceOf[List[CalenderDate]]

  /** ENRICHMENT **/
  var tripPairedList: List[(String, Trip)] = tripFileContents.map(trip => trip.routeId -> trip)
  var routePairedList: List[(String, Route)] = routeFileContents.map(route => route.routeId -> route)
  var calenderDatePairedList: List[(String, CalenderDate)] = calenderDateFileContents.map(calenderDate => calenderDate.serviceId -> calenderDate)

  var tripRouteList: List[(String, TripRoute)] = tripPairedList.map(trip => trip._1 -> new TripRoute(trip._2, routePairedList.find(_._1 == trip._1).get._2))
  var enrichedTripList: List[(String, EnrichedTrip)] = tripRouteList.map(tripRoute => tripRoute._2.trip.serviceId -> new EnrichedTrip(tripRoute._2, calenderDatePairedList.find(_._1 == tripRoute._2.trip.serviceId).get._2))

  enrichedTripList.foreach((line: (String, EnrichedTrip)) => {
      println(line)
    }
  )
}
