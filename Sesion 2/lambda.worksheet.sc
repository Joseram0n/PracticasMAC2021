/*
-- Lambda cálculo

suma2::(Num a)=>a->a->a

suma2 x y = x + y

-- 1 + y = 1 + y
-- nueva y = 1 + y
-- a -> a

-- nueva::(Num a, Integral b)=> a->b->Bool

suma::(Num a)=>a->a->a
suma x y = x + y

suma:: a -> a
suma 1 y = 1 + y 
*/

def suma2(x:Double, y:Double) = x + y
suma2(2,2)

def suma(x:Double, y:Double) = x + y
suma2(2,2)

def suma(y:Double) = 1 + y
suma(2)

List(1,2,3).map(suma2(1,_))