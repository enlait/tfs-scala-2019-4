package example

import com.typesafe.config.ConfigFactory
import org.backuity.clist._

object HelloApp extends CliMain[Unit] {
  var name = arg[String](description = "name to greet")
  val config = ConfigFactory.load()

  def run: Unit = {
    val template = config.getString("greeting.template")
    val greeting = template.replace("{name}", name)
    println(greeting)
  }
}