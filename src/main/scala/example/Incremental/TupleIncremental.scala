package com.ktedon.Incremental

object TupleInstance:

  given TuplePatch[T0, T1, TT0, TT1]: Patch[(T0, T1), (TT0, TT1)] with
    
