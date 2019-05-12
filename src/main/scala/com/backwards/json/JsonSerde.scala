package com.backwards.json

import io.circe.{Decoder, Encoder, shapes}
import shapeless.{Coproduct, Generic}
import shapeless._

object JsonSerde extends JsonSerde

trait JsonSerde {
  implicit def encodeAdtNoDiscr[A, Repr <: Coproduct](implicit
    gen: Generic.Aux[A, Repr],
    encodeRepr: Encoder[Repr]
  ): Encoder[A] = encodeRepr.contramap(gen.to)

  implicit def decodeAdtNoDiscr[A, Repr <: Coproduct](implicit
    gen: Generic.Aux[A, Repr],
    decodeRepr: Decoder[Repr]
  ): Decoder[A] = decodeRepr.map(gen.from)

  /*implicit def decoderValueClass[T <: AnyVal, V](
    implicit
    gen:     Lazy[Generic.Aux[T, V :: HNil]],
    decoder: Decoder[V]
  ): Decoder[T] = Decoder.instance { cursor =>
    decoder(cursor).map { value ⇒
      gen.value.from(value :: HNil)
    }
  }

  implicit def encoderValueClass[T <: AnyVal, V](
    implicit
    gen:     Lazy[Generic.Aux[T, V :: HNil]],
    encoder: Encoder[V]
  ): Encoder[T] = Encoder.instance { value =>
    encoder(gen.value.to(value).head)
  }*/
}