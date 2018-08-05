package ca.mcit.bigdata.project1.dao

import ca.mcit.bigdata.project1.model.Model

object DaoFactory {
  def getDao[ DAO <: Dao[_ <: Model]](daoClass: Class[DAO]): DAO = {
    val dao: DAO = daoClass.newInstance()
    return dao
  }
}
