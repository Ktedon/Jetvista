package com.ktedon.Incremental

trait Patch[T0, T1] extends cats.kernel.Monoid[T1]:
  // cats.kernel.Monoid dependencies
  def combine(x: T1, y: T1): T1
  def empty: T1

  // com.ktedon.Patch dependencies
  def patch(x: T0, y: T1): T0

trait Diff[T0, T1] extends Patch[T0, T1]:
  // com.ktedon.Patch dependencies
  def combine(x: T1, y: T1): T1
  def empty: T1
  def patch(x: T0, y: T1): T0

  // com.ktedon.Diff dependencies
  def diff(x: T0, y: T0): T1

type Change = [T] =>> T

def fromChange[T0, T1](patch: Patch[T0, T1])(using change: Change[T0] => T1) = ???
def toChange[T0, T1](patch: Patch[T0, T1])(using change: T1 => Change[T0]) = ???
