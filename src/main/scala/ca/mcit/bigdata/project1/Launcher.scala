package ca.mcit.bigdata.project1

object Launcher extends App {

  /**
    * File name is given by command line using option --file-name.
    * For example, --file-name=my-file.csv if the type is set to "csv" in configuration file
    */
  private val cmdLineOptions = new CommandLineOptionParser(args).parseOptions

}
