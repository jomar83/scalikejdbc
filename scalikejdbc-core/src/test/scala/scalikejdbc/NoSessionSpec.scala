package scalikejdbc

import org.scalatest._
import java.sql._
import util.control.Exception._

class NoSessionSpec extends FlatSpec with Matchers {

  behavior of "NoSession"

  it should "be available" in {
    val singleton = NoSession
    singleton should not be null
  }

}
