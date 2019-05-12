package com.backwards.adt.json

import com.backwards.adt._
import com.backwards.json.{JsonFormat, JsonSerde}

object SubscriptionSerde extends SubscriptionSerde

trait SubscriptionSerde extends JsonSerde with ZuluDateTimeFormat {
  //implicit val subscriptionFormat: OFormat[Subscription] = derived.oformat[Subscription]()
}