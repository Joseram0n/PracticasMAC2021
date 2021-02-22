// funcionTupla:: Num a => ((a->a->a), a, (a->a->a)) -> a
// funcionTupla (f, n, g) = (f n n) + (g n n)

def funcionTupla(f:((Int,Int) => Int),n:Int,g:((Int,Int) => Int)):Int = f(n,n) + g(n,n)

funcionTupla(_+_,3,_*_)