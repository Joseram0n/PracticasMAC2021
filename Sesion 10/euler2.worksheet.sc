// fibonacciTerm x 
//   | x == 1 = 1
//   | x == 2 = 2
//   | x > 2 = fibonacciTerm (x -1 ) + fibonacciTerm (x-2)

// fibonacciList y = [ z | x <- [1..y], let z = fibonacciTerm x, even z]

// euler2 = sum (fibonacciList 32)


def fibonacciTerm(x:Int):Int = x match {
    case x if(x == 1) => 1
    case x if(x == 2) => 2
    case x if(x > 2) => fibonacciTerm(x-1) + fibonacciTerm(x-2)
    case _ => 0
}

def fibonacciList(y:Int) = List.range(1,y+1).map(n => fibonacciTerm(n)).filter(a => a % 2 == 0)

fibonacciList(10)

fibonacciTerm(10)

val euler2 = fibonacciList(33).sum