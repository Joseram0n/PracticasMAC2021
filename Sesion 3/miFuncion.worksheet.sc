/*
suma3:: Num a => a -> a -> a -> a
suma3 x y z = x + y + z


miFuncion::[(a->b)] -> [a] -> [b]
miFuncion [] _ = []
miFuncion (f:fs) (x:xs) = (f x):(miFuncion fs xs)
*/

def suma3(a:Int, b:Int, c:Int) = a + b + c

def f1(x: Int): Int = x + 1 //+1

def f2(x: Int): Int = x + 2 //+2

def f3(x: Int): Int = x + 3 //+3

def miFuncion(f:List[Int => Int], lista:List[Int]): List[Int] = { 
    if (lista == Nil) 
        Nil 
    else 
        f.head(lista.head) :: miFuncion(f.tail,lista.tail)
}

val test = List(f1 _,f2 _,f3 _)

miFuncion(test,List(1,2,3))
miFuncion(List(_+1,_+2,_+3),List(1,2,3))

val prueba = suma3(2,_,_)

def miFuncion2(f2:(Int,Int) => Int, lista2:List[Int]): List[Int] = { 
    if (lista2 == Nil) 
        Nil 
    else 
        lista2.map(x => f2(x,x))
}

miFuncion2(suma3(2,_,_),List(1,2,3))