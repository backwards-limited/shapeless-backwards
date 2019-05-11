package com.backwards.json

import play.api.libs.functional.syntax._
import play.api.libs.json._
import shapeless._

object JsonFormat extends JsonFormat

trait JsonFormat {
  implicit def valueClassFormat[T <: AnyVal, V](
    implicit gen: Lazy[Generic.Aux[T, V :: HNil]],
    format: Format[V]
  ): Format[T] = new Format[T] {
    override def writes(t: T): JsValue = format.writes(gen.value.to(t).head)

    override def reads(json: JsValue): JsResult[T] = JsSuccess(gen.value.from(format.reads(json).get :: HNil))
  }

  def format[A, B](f: A => B, g: B => A)(implicit F: Format[A]): Format[B] = F.inmap(f, g)
}