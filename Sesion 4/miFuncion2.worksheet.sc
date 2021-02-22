// miFuncion2 que es cierto si devuelve una lista
// de listas resultado de aplicar las funciones
// de la lista de funciones del primer argumento a todos
// los valores de la lista de valores del segundo argumento.
// Ejemplo: 
// miFuncion2 [(+1), (+2), (+3)] [1,2,3] -> [[2,3,4],[3,4,5],[4,5,6]] 

// miFuncion2::[(a->b)] -> [a] -> [[b]]  
// miFuncion2 [] _ = []  
// miFuncion2 (f:fs) lista = (map f lista):(miFuncion2 fs lista) 


def miFuncion2(listaFn:List[Double => Double],listaNum:List[Double]):List[List[Double]] = {
    listaFn match {
        case cabeza :: resto => listaNum.map(cabeza) :: miFuncion2(resto,listaNum)
        case Nil => List()
    }
}

val x = miFuncion2(List(_+1,_+2,_+3),List(1,2,3))

print(x)
