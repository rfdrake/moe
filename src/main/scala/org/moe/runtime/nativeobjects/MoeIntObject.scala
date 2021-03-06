package org.moe.runtime.nativeobjects

import org.moe.runtime._

import scala.util.{Try, Success, Failure}

class MoeIntObject(
    v: Int, klass : Option[MoeClass] = None
  ) extends MoeNativeObject[Int](v, klass) {

  // MoeObject overrides

  override def isFalse: Boolean = getNativeValue == 0
  override def toString = getNativeValue.toString

  // unboxing
  
  override def unboxToInt: Try[Int] = Success(getNativeValue)
  override def unboxToDouble: Try[Double] = Success(getNativeValue.toDouble)
}