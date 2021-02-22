def solucion = {
    var num = List.range(2,110000);
    var pr = List(2);
    while (pr.length < 10001) {
      val p = pr.head;
      num = num.filter((b) => (b%p != 0));
      pr = num.head :: pr;
    }
    pr.head
  }

print(solucion)

// Otra forma con funcion perezosa y generadores de lista (Stream)

lazy val primos: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
  primos.takeWhile(j => j * j <= i).forall(i % _ > 0))

val sol = primos(10000)
