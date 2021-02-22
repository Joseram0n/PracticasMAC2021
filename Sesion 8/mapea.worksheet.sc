
//Replica la funcion map

def mapea(fun: (Int) => Int, lista: List[Int]): List[Int] = {
    for {
        x <- lista
    } yield fun(x)
}

mapea((_ + 1),List(1,2,3,4))