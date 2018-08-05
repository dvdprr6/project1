package ca.mcit.bigdata.project1.dao

import ca.mcit.bigdata.project1.model.Model

trait Dao[MODEL <: Model]{
  def parseCSV(subLine: List[String]): MODEL
}
