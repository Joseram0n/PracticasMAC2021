// -- funcionTupla:: Num a => ((a->a->a), a, (a->a->a)) -> a
// funcionTuplaBool (f, n, g) = (f n) || (g n) 

def funcionTupla(f:((Boolean,Boolean) => Boolean),n:Boolean,g:((Boolean,Boolean) => Boolean)):Boolean = f(n,n) || g(n,n)

funcionTupla(_ || _, true, _ && _)

def funcionTupla2(f:((Boolean,Boolean) => Boolean),n:(Boolean,Boolean),g:((Boolean,Boolean) => Boolean)):Boolean = f(n._1,n._2) || g(n._1,n._2)

funcionTupla2(_ || _, (false,false), _ && _)
