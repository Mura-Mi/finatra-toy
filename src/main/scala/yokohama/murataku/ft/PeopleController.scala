package yokohama.murataku.ft

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class PeopleController extends Controller {
  get("/people/:id") { request: Request =>
    s"I'm member #${request.params("id")}"
  }
}
