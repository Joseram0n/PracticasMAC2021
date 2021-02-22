// integral :: (Num a, Enum a) => (a -> a) -> a -> a -> a -> a
// integral f a b t = sum [ t * f x| x <- [a, a+t .. b-t]]

//Implementacion Manuel Jesus
// calculaIntegral f a b t
// 	| b <= a = 0
// 	| (a + t) > b = (f a) * (b - a)
// 	| a < b = (f a) * t + calculaIntegral f (a+t) b t

def integral(f:Double => Double,a:Double,b:Double,t:Double):Double = {
    (a to (b-t) by t toList).map( x => f(x) * t).sum
}

integral(Math.pow(_,2),1,10,0.1)


val a = 1d
val b = 4d
val t = 0.5d

(a to (b-t) by t toList)
