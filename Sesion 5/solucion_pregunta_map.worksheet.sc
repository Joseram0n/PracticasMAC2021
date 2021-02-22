// Solución a la pregunta
// (a->b)  --->  (a->a->a)
// (a->b)  ---> (a->a->a->a)  -> [(a->a->a)]

// map (suma3 2) [1,2,3] 
// Devuelve una lista de funciones de dos argumentos
// de entrada y uno de salida. La función suma 2 a los
// otros dos argumentos de entrada.
// [(+3), (+4), (+5)]

// suma3:: Num a => a -> a -> a -> a
// suma3::Int->Int->Int->Int
// suma3 x y z = x + y + z

// funcSolMap [] _ = []
// funcSolMap (f:fs) (x:xs) = f x:(funcSolMap fs xs)

// Main> funcSolMap (map (suma3 2) [1,2,3]) [1,2,3]
// [4,6,8]


def suma3(a:Int, b:Int, c:Int) = a + b + c

def funcSolMap(f:(Int,Int) => Int, lista:List[Int]): List[Int] = { 
    if (lista == Nil) 
        Nil 
    else 
        lista.map(x => f(x,x))
}

funcSolMap(suma3(2,_,_),List(1,2,3))