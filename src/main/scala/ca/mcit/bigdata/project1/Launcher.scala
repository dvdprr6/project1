package ca.mcit.bigdata.project1


import ca.mcit.bigdata.project1.input.InputSource
import ca.mcit.bigdata.project1.model.Model
import ca.mcit.bigdata.project1.util.Constants

object Launcher extends App {

  /**
    * File name is given by command line using option --file-name.
    * For example, --file-name=my-file.csv if the type is set to "csv" in configuration file
    */
  //private val cmdLineOptions = new CommandLineOptionParser(args).parseOptions



  //val inputSource = new InputSource(fileReaderParser, cmdLineOptions.trips)
  //val inputSource = new InputSource(fileReaderParser, "/home/david/Desktop/gtfs_stm/trips.txt")
  var tripInputSource = new InputSource(Constants.TRIPS, "/home/david/Desktop/gtfs_stm/trips.txt")
  var tripFileContents: List[Model] = tripInputSource.parseFile()

  var routeInputSource = new InputSource(Constants.ROUTES, "/home/david/Desktop/gtfs_stm/routes.txt")
  var routeFileContents: List[Model] = routeInputSource.parseFile()

  var calenderDateInputSource = new InputSource(Constants.CALENDER_DATES, "/home/david/Desktop/gtfs_stm/calendar_dates.txt")
  var calenderDateContents: List[Model] = calenderDateInputSource.parseFile()

  println(tripFileContents)
}
