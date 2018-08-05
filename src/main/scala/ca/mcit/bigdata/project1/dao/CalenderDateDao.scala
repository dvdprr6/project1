package ca.mcit.bigdata.project1.dao

import ca.mcit.bigdata.project1.model.CalenderDate

class CalenderDateDao extends Dao[CalenderDate]{
  override def parseCSV(subLine: List[String]): CalenderDate = {
    return new CalenderDate(subLine(0), subLine(1), subLine(2))
  }
}
