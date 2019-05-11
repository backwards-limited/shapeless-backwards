package com.backwards.adt.json

import scala.language.postfixOps
import play.api.libs.json.{JsString, Reads, Writes}
import org.joda.time.DateTimeZone
import com.backwards.adt.ZuluDateTime

object ZuluDateTimeFormat extends ZuluDateTimeFormat

trait ZuluDateTimeFormat {
  implicit val zuluDateTimeWrites: Writes[ZuluDateTime] =
    Writes(dt => JsString(dt.value withZone DateTimeZone.UTC toString))

  implicit val zuluDateTimeReads: Reads[ZuluDateTime] = Reads[ZuluDateTime](
    _.validate[String].map(ZuluDateTime.apply)
  )
}