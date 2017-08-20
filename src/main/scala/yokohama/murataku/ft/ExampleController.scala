package yokohama.murataku.ft

import javax.inject.Inject

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class ExampleController @Inject()() extends Controller {
  get("/ping") { (request: Request) => "pong" }

  get("/name") { (request: Request) => response.ok.contentType("text/html").body("Mura-Mi") }
}
