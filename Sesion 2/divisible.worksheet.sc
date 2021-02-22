/*divisible::Int->Int->Bool
divisible x y = resto == 0
  where resto = mod x y 
*/

def divisible(x:Int, y:Int):Boolean = x % y == 0

divisible(3,5)
divisible(4,2)