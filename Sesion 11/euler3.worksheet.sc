// divisores :: Integral a => a -> [a]
// divisores num =
//     [ x | x <- [1..num], (mod num x) == 0]

// primos :: Integral a => a -> Bool
// primos num = length(divisores num) == 2

// factorPrimo :: Integral a => a -> [a]
// factorPrimo num =
//     [x | x <- [1..num], mod num x == 0 && primos x == True ]


def divisores(x:Double):List[Double] = (1d to x by 1d toList).filter(n => (x % n) == 0)

def primos(x:Double):Boolean = List(1,x) == divisores(x)

def factorPrimo(n:Double):List[Double] = {
    divisores(n).filter( x => primos(x) == true)
}

factorPrimo(4)
factorPrimo(34)
factorPrimo(13195)
// Scala se queja de que es un numero muy grande ???
//factorPrimo(600851475143L)


// Otra implementacion, No es mia
// https://stackoverflow.com/questions/4747776/project-euler-largest-prime-factor-in-scala

def largestPrimeFactor(b : BigInt) = {
  def loop(f:BigInt, n: BigInt): BigInt =
     if (f == n) n else 
     if (n % f == 0) loop(f, n / f) 
     else loop(f + 1, n)
  loop (BigInt(2), b)
}

largestPrimeFactor(600851475143L)