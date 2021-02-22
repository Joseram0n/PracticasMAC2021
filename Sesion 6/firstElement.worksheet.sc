// firstElem :: [a] -> Maybe a
// firstElem xs = case xs of
//   [] -> Nothing
//   -- Remember to put parantheses around this pattern-match else
//   -- the compiler will throw a parse-error
//   (x:_) -> Just x 


def firstElement(lista:List[Int]) = lista match {
    case Nil => Nil
    case x :: _ => x
}

firstElement(List(1,2,3))
firstElement(List())