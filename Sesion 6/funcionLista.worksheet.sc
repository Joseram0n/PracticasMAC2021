// funcionLista lista =
//   case lista of
//     [] -> "(none)"
//     [a] -> show a
//     [a, b] -> show a ++ " and " ++ show b
//     [a, b, c] -> show a ++ ", " ++ show b ++ ", and " ++ show c
//     (a:b:c) -> show a ++ ", " ++ show b ++ ", and (" ++ (show $ length c) ++ ") more" 

def funcionLista[A](lista:List[A]) = lista match {
    case Nil => "None"
    case a :: Nil => a.toString()
    case a :: b :: Nil => a + " and " + b
    case a :: b :: c :: Nil => a + ", " + b + " and " + c
    case a :: b :: c :: resto => a + ", " + b + " and (" + (resto.length + 1) + ") more"
    case _ => Nil
}


funcionLista(List())
funcionLista(List(1))
funcionLista(List(1,2))
funcionLista(List(1,2,3))
funcionLista(List(1,2,3,4))