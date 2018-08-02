package ca.mcit.bigdata.project1.parser
import ca.mcit.bigdata.project1.model.{CalenderDate, Route, Trip}

class FileReaderCSVParser extends FileReaderParser {
  override def parseTrip(subLine: String): Trip = ???

  override def parseRoute(subLine: String): Route = ???

  override def parseCalenderDate(subLine: String): CalenderDate = ???
}
