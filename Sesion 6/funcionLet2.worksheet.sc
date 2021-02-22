// funcionLet2 lista = z
//   where [_,_,z] = lista 


def funcionLet2[A](lista:List[A]) = lista match {
    case Nil => Nil
    case _ :: _ :: z :: Nil => z
    case _ => Nil
}

val test = (1 to 10) toList

funcionLet2(test)
funcionLet2(List(1,2,3))