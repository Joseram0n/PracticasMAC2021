def NoNegativo(a:Double): Boolean = a >= 0

NoNegativo(-4.3)

//generico para tipos numericos
def NoNegativo[A](x: A)(implicit numeric: Numeric[A]): Boolean = numeric.signum(x) == -1 

NoNegativo(3)
NoNegativo(-2.0F)
NoNegativo(-5L)