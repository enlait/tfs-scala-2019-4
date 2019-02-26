package example

import akka.http.scaladsl.server.{HttpApp, Route}

class Server(template: String) extends HttpApp {

  override def routes: Route =
    pathEndOrSingleSlash { greet("Username") } ~
    path(Segment) { greet }


  def greet(name: String) = complete(template.replace("{name}", name))
}