// divisores :: Integral a => a -> [a]
// divisores num =
//     [ x | x <- [1..num], (mod num x) == 0]

// primos :: Integral a => a -> Bool
// primos num = length(divisores num) == 2

// calculaPrimos :: [Integer]
// calculaPrimos =
//     [x | x <- [1..] , primos x]

// calculaHash :: [Integer] -> Integer
// calculaHash list =
//     sum [list !! x  *  li !! x | x <- [0..length(list)-1]]
//         where li = reverse (take (length list) calculaPrimos) 


// Primero se obtiene una lista de primos con el mismo tamaño que la lista pasada por parametro
// para luego invertirla, despues las dos listas se transforman en tuplas mediante zip para poner mapear
// una funcion de multiplicacion y por ultimo realizar la suma 
def funcionHash(lista:List[Int]):Int = {
    val p = primos.take(lista.length).reverse
    
    (lista,p.toList).zipped.map(_*_).sum
}

// Esta funcion es perezosa, con lo cual solo se evalua al ejecutarse
// Stream quiere decir que genera infinitamente, "from(3)" a partir de 3
// La definicion "2 #::" es simplemente que la secuencia empieza en 2
// takeWhile coje elementos mientras cumpla la condicion
// forall se aplica a todos los elementos
lazy val primos: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
   primos.takeWhile(j => j * j <= i).forall{ k => i % k > 0});

funcionHash(List.range(1,1000))
