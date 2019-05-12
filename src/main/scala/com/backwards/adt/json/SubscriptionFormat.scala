package com.backwards.adt.json

import play.api.libs.json.OFormat
import julienrf.json.derived
import com.backwards.adt._
import com.backwards.json.JsonFormat

object SubscriptionFormat extends SubscriptionFormat

trait SubscriptionFormat extends JsonFormat with ZuluDateTimeFormat {
  implicit val subscriptionFormat: OFormat[Subscription] = derived.oformat[Subscription]()
}