import scala.util.Failure
// factorial::Integral a => a -> a

// factorial n 
//   | n == 0       = 1
//   | n < 0        = error "valor no valido"
//   | n > 0        = n * factorial (n-1) 

def factorial(a:Int):Int = a match {
    case a if (a == 0) => 1
    case a if (a < 0) => throw new Exception("valor no valido")
    case a if (a > 0) => (a * factorial(a-1))
}

factorial(5)
factorial(1)
factorial(0)
//factorial(-15) //da error obviamente