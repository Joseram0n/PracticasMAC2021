def suma(a:Double, b:Double) = a + b

suma(4,6.4)

//Otra forma mas Generica

def sumar[A](x: A, y: A)(implicit numeric: Numeric[A]): A = numeric.plus(x, y)

sumar(3 + 1,4.5)