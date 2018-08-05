package ca.mcit.bigdata.project1.dao

import ca.mcit.bigdata.project1.model.Trip

class TripDao extends Dao[Trip]{
  override def parseCSV(subLine: List[String]): Trip = {
    return new Trip(subLine(0), subLine(1), subLine(2), subLine(3), subLine(4), subLine(5), subLine(6), subLine(7), subLine(8))
  }
}
