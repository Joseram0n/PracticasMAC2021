def divisores(x:Int):List[Int] = List.range(1,x + 1).filter(n => (x % n) == 0)

def primos(x:Int):Boolean = List(1,x) == divisores(x)


primos(3)
primos(4)
primos(5)
primos(9)