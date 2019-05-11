package com.backwards.adt.json

import play.api.libs.json._
import org.scalatest.{MustMatchers, WordSpec}
import com.github.nscala_time.time.Imports.DateTime
import com.backwards.adt._

class PartnerSubscriptionFormatSpec extends WordSpec with MustMatchers with PartnerSubscriptionFormat {
  val now: ZuluDateTime = ZuluDateTime(DateTime.now)

  val partnerSubscription = PartnerSubscription(
    ProductId("productId"),
    PartnerSubscriptionId("39"),
    PartnerTransactionId("42"),
    OriginalPurchaseDate(now),
    PurchaseDate(now),
    Option(ExpiresDate(now))
  )

  "Partner subscription format" should {
    "Encode ADT to JSON and decode" in {
      val json = Json toJson partnerSubscription

      // TODO - Actual assertion
      println(Json prettyPrint json)

      println(json.as[PartnerSubscription])
    }
  }
}