// Euler 1
// sum [x | x <- [1..999], mod x 3 == 0 || mod x 5 == 0]

val euler1 = List.range(1,1000).map(x => if(((x % 3) == 0) || ((x % 5) == 0)) x else 0).sum 