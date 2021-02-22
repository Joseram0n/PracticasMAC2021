// maximo (cab:resto) = max cab (maximo resto)
// maximo [n] = n
// maximo [] = (-99999999999999) 

// palindromo n = reverse (show n) == show n

// listPalindromos = take 10 [ n | x <- [999,998..100], y <- [999,998..100], let n = x*y, palindromo n]

// euler4 = maximum listPalindromos 

def palindromo (valor:String) =
    valor.substring(0, valor.length/2) == valor.substring(valor.length/2).reverse

def solucion = (for (a <- 100 until 999 ; b <- 100 until 999
                     if palindromo(a * b toString)) yield a*b).max

print(solucion)