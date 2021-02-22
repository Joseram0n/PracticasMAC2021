// -- De Ricardo Manuel Ruiz Diaz para todos:  09:28 AM
// divisores :: Integral a => a -> [a]
// divisores num =
//     [ x | x <- [1..num], (mod num x) == 0]

def divisores(x:Int):List[Int] = List.range(1,x + 1).filter(n => (x % n) == 0)

// -- De Ricardo Manuel Ruiz Diaz para todos:  10:18 AM
// filtra::(a->Bool) -> [a] -> [a]
// filtra p b = 
//     [ x | x <- b, p x == True]

def filtra[A](lista:List[A])(fun: A => Boolean):List[A] = {
    lista.foldRight(List[A]())((b, a) => if(fun(b)) b :: a else a)
}

// mapea::(a -> b) -> [a] -> [b]
// mapea p b = 
//     [ p x | x <- b]

def mapea(fun: (Int) => Int, lista: List[Int]): List[Int] = {
    for {
        x <- lista
    } yield fun(x)
}

// -- De Ricardo Manuel Ruiz Diaz para todos:  10:24 AM
// doble :: Num a => a -> a
// doble a = 2 * a

def doble(a:Int):Int = a * 2

// triple :: Num a => a -> a
// triple a = 3 * a

def triple(a:Int):Int = a * 3

// evaluaciones::[a]->[(a->b)]->[[b]]
// evaluaciones [] _ = []
// evaluaciones (x:xs) f = 
//     [w x | w <- f] : (evaluaciones xs f)

def evaluaciones(lista:List[Int],fun:(List[Int => Int])):List[List[Any]] = {
    for(a <- lista) yield fun.map( f => f(a))
}

val test = evaluaciones(List(1,2,3),List(doble _,triple _))

print(test)