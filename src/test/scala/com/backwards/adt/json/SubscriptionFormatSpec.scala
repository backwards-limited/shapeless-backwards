package com.backwards.adt.json

import play.api.libs.json._
import org.scalatest.{MustMatchers, WordSpec}
import com.github.nscala_time.time.Imports.DateTime
import com.backwards.adt._

class SubscriptionFormatSpec extends WordSpec with MustMatchers with SubscriptionFormat {
  val now: ZuluDateTime = ZuluDateTime(DateTime.now)

  val subscription = Subscription(
    ProductId("productId"),
    SubscriptionId("39"),
    TransactionId("42"),
    OriginalPurchaseDate(now),
    PurchaseDate(now),
    Option(ExpiresDate(now))
  )

  "Subscription format" should {
    "Encode ADT to JSON and decode" in {
      val json = Json toJson subscription

      // TODO - Actual assertion
      println(Json prettyPrint json)

      println(json.as[Subscription])
    }
  }
}