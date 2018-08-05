package ca.mcit.bigdata.project1.dao

import ca.mcit.bigdata.project1.model.Route

class RouteDao extends Dao[Route]{
  override def parseCSV(subLine: List[String]): Route = {
    return new Route(subLine(0), subLine(1), subLine(2), subLine(3), subLine(4), subLine(6), subLine(7))
  }
}
