
def factorial(n:Int):BigInt = {
        if (n == 0)  
            1
        else
            n * factorial(n-1) 
}

factorial(15)

//Con match

def factorial_match(n: Int): Any = n match {
    case 0 => 1
    case n if n > 0 => n * factorial(n-1)
    case _ => println("valor negativo")
}

factorial_match(15)
factorial_match(-4)