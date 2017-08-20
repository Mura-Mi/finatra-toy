package yokohama.murataku.ft

import com.twitter.finagle.http.Response
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.filters.{CommonFilters, LoggingMDCFilter, TraceIdMDCFilter}
import com.twitter.finatra.http.routing.HttpRouter

class ExamplesServer extends HttpServer {

  override def configureHttp(router: HttpRouter): Unit = router
    .filter[LoggingMDCFilter[Request, Response]]
    .filter[TraceIdMDCFilter[Request, Response]]
    .filter[CommonFilters]
    .add[ExampleController]

  override val modules = Seq()

}

object ExamplesServerMain extends ExamplesServer
