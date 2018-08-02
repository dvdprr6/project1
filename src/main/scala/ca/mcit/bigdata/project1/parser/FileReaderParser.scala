package ca.mcit.bigdata.project1.parser

import ca.mcit.bigdata.project1.model.{CalenderDate, Route, Trip}

trait FileReaderParser {
  def parseTrip(subLine: String): Trip
  def parseRoute(subLine: String): Route
  def parseCalenderDate(subLine: String): CalenderDate
}
