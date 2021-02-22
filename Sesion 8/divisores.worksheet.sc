// -- Implementación de Ricardo Manuel Ruiz
// divisores :: Integral a => a -> [a]
// divisores num =
//     [ x | x <- [1..num], (mod num x) == 0]

def divisores(x:Int):List[Int] = List.range(1,x + 1).filter(n => (x % n) == 0)

divisores(9)

