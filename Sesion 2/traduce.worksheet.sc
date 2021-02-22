/*
traduce x = case x of
  1 -> "A"
  2 -> "B"
  3 -> "C"
  otherwise -> "X"
*/

def traduce(n: Int): String = n match {
    case 1 => "A"
    case 2 => "B"
    case 3 => "C"
    case _ => "X"
}

traduce(1)
traduce(2)
traduce(3)
traduce(4)

