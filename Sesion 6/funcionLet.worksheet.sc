/* funcionLet lista = z
   where (_:_:z) = lista 
*/

val test = (1 to 10) toList


def funcionLetClase(lista:List[Int]) = lista.drop(2)

def funcionLet[A](lista:List[A]):List[List[A]] = List(List(lista.head),List(lista.apply(1)),lista.drop(2))

def funcionLetPatron[A](lista:List[A]) = lista match {
    case Nil => Nil
    case x :: y :: resto => List(List(x),List(y),List(resto))
    case _ => Nil
}

funcionLetClase(test)

funcionLet(test)

//Si no puede hacer alguna parte de la subdivision en listas la reemplaza por una lista vacia
funcionLet(List(1,2))

funcionLetPatron(test)
funcionLetPatron((34 to 38) toList)
