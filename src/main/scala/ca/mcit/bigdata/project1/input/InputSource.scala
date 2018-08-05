package ca.mcit.bigdata.project1.input

import ca.mcit.bigdata.project1.dao._
import ca.mcit.bigdata.project1.model.Model
import ca.mcit.bigdata.project1.util.Constants
import com.github.tototoshi.csv.CSVReader

import scala.collection.mutable.ListBuffer
import scala.io.Source

class InputSource(var model: String, var file: String) {

  def parseFile(): List[Model] = {
    val fileContents = CSVReader.open(Source.fromFile(file)).all().drop(1)

    var result = new ListBuffer[Model]()

    fileContents.foreach((line: List[String]) => {
        result += matchDao(model).parseCSV(line)
      }
    )

    return result.toList
  }

  private def matchDao(model: String): Dao[_ <: Model] = model match{
    case Constants.TRIPS => DaoFactory.getDao(classOf[TripDao])
    case Constants.ROUTES => DaoFactory.getDao(classOf[RouteDao])
    case Constants.CALENDER_DATES => DaoFactory.getDao(classOf[CalenderDateDao])
    case _ => throw new UnsupportedOperationException
  }

}
