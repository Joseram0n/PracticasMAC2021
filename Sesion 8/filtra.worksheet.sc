
//filtra una lista con una funcion pasada como argumento separado

def filtra[A](lista:List[A])(fun: A => Boolean):List[A] = {
    lista.foldRight(List[A]())((b, a) => if(fun(b)) b :: a else a)
}

filtra(List(1,2,3,4,5,6,7,8))(_ > 3 )
