package com.backwards.adt.json

import play.api.libs.json.OFormat
import julienrf.json.derived
import com.backwards.adt._
import com.backwards.json.JsonFormat

object PartnerSubscriptionFormat extends PartnerSubscriptionFormat

trait PartnerSubscriptionFormat extends JsonFormat with ZuluDateTimeFormat {
  implicit val partnerSubscriptionFormat: OFormat[PartnerSubscription] = derived.oformat[PartnerSubscription]()
}