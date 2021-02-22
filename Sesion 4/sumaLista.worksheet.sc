// Suma todos los elementos de una lista
// de forma recursiva utilizando el principio
// de inducción matemático
// 1) P(n0)
// 2) P(n-1) -> P(n)
//    ¿Cómo hago el n-1 en listas?
//    Quitando solo un elemento de la lista
//    con la ayuda del operador ":" (cabeza:resto

// Suma es cierto si devuelve la suma de los
// elementos de la lista que se pasa como primer
// argumento

// suma [1,2,3] -> suma [2,3] -> suma [3] -> suma [] 
//      1+5           2+3          3+0         0

// suma::Num a =>[a] -> a

// suma [] = 0
// suma (cabeza:resto) = cabeza + (suma resto)


def sumaLista(lista:List[Double]): Double = {
    if (lista == Nil) 
        0
    else
        lista.sum
}       


sumaLista(List(1,2,3))

def sumaListaRecursiva(lista:List[Double]): Double = {
    lista match {
        case cabeza :: resto => cabeza + sumaListaRecursiva(resto)
        case Nil => 0
    }
}

sumaLista(List(1,2,3))