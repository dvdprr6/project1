package ca.mcit.bigdata.project1

import com.typesafe.config.{Config, ConfigFactory}

/**
  * This class is added to read configuration file and expose is to the project.
  * How to make this class similar to Java singleton in a way that all the configuration are
  * available without the need of instantiating new object?
  * How `lazy` helps us here?
  */
class Configuration {
  private lazy val config: Config = ConfigFactory.load()
  lazy val studentName: String = config.getString("name")
  lazy val inputFileType: String = config.getString("type")
}
