// Solucion Manuel Jesus
// valorPi::(Enum a, Ord a, Floating a) => a -> a
// valorPi t = sum[t*t |x <- [-1 + t/2, -1 + 3*t/2..1-t/2], y <- [-1 + t/2, -1 + 3*t/2..1-t/2], sqrt(x^2 + y^2) <= 1]

//No funciona intentando imitar las listas intensionales
def aprox_pi(t:Double) = {
    val x = List.concat(List(-1 + t/2),((-1 + 3*t/2) to (1-t/2) by t/2))
    
    val xfiltrada = x.filter(n => Math.sqrt(Math.pow(n,2)+Math.pow(n,2)) <= 1)

    xfiltrada.map(n => n*n).sum

}

aprox_pi(0.03)


// Usando metodo de Leibniz
def aprox_pi_Leib(t:Double):Double = {
    var pi: Double = 0
    var n = 0
    
    while (n < t) {
      pi = pi + (Math.pow(-1,n)/(2*n+1))
      n = n+1
    }

    pi*4
}

aprox_pi_Leib(1000)

// Estilo MonteCarlo

import scala.util.Random

def testCirulo() = {
  val (x, y) = (Random.nextDouble, Random.nextDouble)
  Math.sqrt(x*x + y*y) <= 1
}

def monteCarlo(intentos: Int, test: () => Boolean) =
    Stream
      .continually(if (test()) 1.0 else 0.0)
      .take(intentos)
      .sum / intentos * 4


monteCarlo(10000,testCirulo)