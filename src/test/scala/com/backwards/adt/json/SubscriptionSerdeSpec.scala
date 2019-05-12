package com.backwards.adt.json

import org.scalatest.{MustMatchers, WordSpec}
import com.backwards.adt._
import com.github.nscala_time.time.Imports.DateTime
import io.circe.parser.decode
import io.circe.syntax._

// TODO - WIP
class SubscriptionSerdeSpec extends WordSpec with MustMatchers with SubscriptionSerde {
  val now: ZuluDateTime = ZuluDateTime(DateTime.now)

  val subscription = Subscription(
    ProductId("productId"),
    SubscriptionId("39"),
    TransactionId("42"),
    OriginalPurchaseDate(now),
    PurchaseDate(now),
    Option(ExpiresDate(now))
  )

  "Subscription serde" should {
    "Encode ADT to JSON and decode" in {
      val json = subscription.asJson

      // TODO - Actual assertion
      println(json.spaces2)

      println(decode[Subscription](json.noSpaces))
    }
  }
}