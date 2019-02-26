package example

import com.typesafe.config.ConfigFactory

object HelloApp extends App {
  val config = ConfigFactory.load()
  val template = config.getString("greeting.template")

  val server = new Server(template)

  server.startServer("0.0.0.0", 8080)
}


