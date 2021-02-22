def funcionMonedas(ms: List[Int], n: Int): Int = ms match {
  case h :: t =>
    if (h > n) 0 else if (n == h) 1 else funcionMonedas(ms, n - h) + funcionMonedas(t, n)
  case _ => 0
}

val sol = funcionMonedas(List(1, 2, 5, 10, 20, 50, 100, 200), 200)