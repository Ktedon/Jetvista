package com.ktedon.Incremental

object UnitInstance:

  given UnitPatch: Patch[Unit, Unit] with
    def combine(x: Unit, y: Unit): Unit = empty
    def empty: Unit = ()
    def patch(x: Unit, y: Unit): Unit = ()

  given UnitDiff: Diff[Unit, Unit] with
    def combine(x: Unit, y: Unit): Unit = UnitPatch.combine(x, y)
    def empty: Unit = UnitPatch.empty
    def patch(x: Unit, y: Unit): Unit = UnitPatch.patch(x, y)
    def diff(x: Unit, y: Unit): Unit = ()
