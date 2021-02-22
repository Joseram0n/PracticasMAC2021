# Ejercicios de Project Euler para complementar las sesiones

Despues de traducir los ejercicios en clase voy a resolver algunos problemas de Project Euler para poner a prueba el conocimiento adquirido.

## Ejercicio Euler Numero 7: 10001st prime

>By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?

El código es bastante sencillo, en la primera solución se usa un enfoque mas tradicional mientras que en la segunda se intenta realizar algo parecido a las listas intensionales.

Código:

``` Scala
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

print(sol)
```

Solución: 104743

## Ejercicio Euler Numero 31: Coin Sum

>In the United Kingdom the currency is made up of pound (£) and pence (p). There are eight coins in general circulation:
>
>    1p, 2p, 5p, 10p, 20p, 50p, £1 (100p), and £2 (200p).
>
>It is possible to make £2 in the following way:
>
>    1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
>
>How many different ways can £2 be made using any number of coins?

Nuevamente usamos los conocimientos adquiridos para resolver el problema.

Código:

``` Scala
def funcionMonedas(ms: List[Int], n: Int): Int = ms match {
  case h :: t =>
    if (h > n) 0 else if (n == h) 1 else funcionMonedas(ms, n - h) + funcionMonedas(t, n)
  case _ => 0
}

val sol = funcionMonedas(List(1, 2, 5, 10, 20, 50, 100, 200), 200)

print(sol)

```

Solución: 73682


## Ejercicio Euler Numero 48: Self Power

>The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
>
>Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.

Un ultimo ejercicio para ver el lo potente que puede llegar a ser el manejo de listas mediante programación funcional.

Código:

``` Scala
def solucion = (1 to 1000 map(x => BigInt(x).pow(x))).sum % BigInt(10).pow(10)

print(solucion)

```

Solución: 9110846700


TODO: Hacer mas ejercicios en un futuro si tengo tiempo