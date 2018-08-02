package ca.mcit.bigdata.project1

case class Options(trips: String = "", routes: String = "", calender: String = "")

class CommandLineOptionParser(args:Array[String]) {

  private val parser = new scopt.OptionParser[Options]("mcit-project-1") {
    head("mcit-project-1", "1.0-SNAPSHOT")
    help("help").text("prints this usage text")
    showUsageOnError
    note(
      s"""
         | This project will parse twitter data and enriches them with ...
         |
         |""".stripMargin)

    opt[String]('t', "trips-file-path")
      .action((in, c) => c.copy(trips = in))
      .required()
      .text("path to the file that contains trips data")

    opt[String]('r', "routes-file-path")
      .action((in, c) => c.copy(routes = in))
      .required()
      .text("path to the file that contains routes data")

    opt[String]('c', "calendar-file-path")
      .action((in, c) => c.copy(calender = in))
      .required()
      .text("path to the file that contains calendar data")

  }

  val parseOptions: Options = parser.parse(args, Options()) match {
    case Some(option) => option
    case None => Options()
  }

}
