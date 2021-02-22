
// -- Return the second element of a list
// secondElem :: [a] -> Maybe a
// secondElem xs = case xs of
//   -- Remember the parantheses
//   (_:y:_) -> Just y   -- en Prolog (_,Y|_)
//   (_:[]) -> Nothing 
//   [] -> Nothing 



def secondElement(lista:List[Int]) = lista match {
    case Nil => Nil
    case x :: Nil => Nil
    case _ :: y :: _ => y
}

secondElement(List(1,2,3))
secondElement(List(1))