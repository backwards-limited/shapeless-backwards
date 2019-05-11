package com.backwards.adt

import org.joda.time.format.DateTimeFormatter
import com.github.nscala_time.time.Imports._

final case class ZuluDateTime private(value: DateTime)

object ZuluDateTime {
  val zuluDateTimeFormatter: DateTimeFormatter =
    DateTimeFormat forPattern "yyyy-MM-dd'T'HH:mm:ss.SSSZ" withZone DateTimeZone.UTC

  def apply(dateTime: String): ZuluDateTime =
    new ZuluDateTime(DateTime.parse(dateTime, zuluDateTimeFormatter))

  def apply(dateTime: DateTime): ZuluDateTime =
    new ZuluDateTime(dateTime.toDateTime(DateTimeZone.UTC))
}