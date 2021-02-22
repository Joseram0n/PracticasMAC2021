// quitaBlancosPrinc::String -> String
// -- equivalente a quitaBlancosPrinc::[Char]->[Char]

// quitaBlancosPrinc (cab:resto)
//   | cab == ' ' = quitaBlancosPrinc resto
//   | otherwise  = (cab:resto) 

//En scala existen los alias pero se aplican de forma un poco diferente a haskell

def quitaBlancosPrinc(cadena:List[Char]):List[Char] = cadena match{
    case cab :: rest => if(cab == ' ') quitaBlancosPrinc(rest) else cadena
    case _ => cadena
}

val test = quitaBlancosPrinc("     Hola Mundo!".toList)
test.toString