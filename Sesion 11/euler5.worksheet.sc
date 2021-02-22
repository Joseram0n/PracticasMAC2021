val divisores = List(20, 19, 18, 17, 16, 15, 14, 13, 12, 11)
def comprobar (x:Int):Int = {
if (divisores.exists((a) => (x % a != 0))) return comprobar(20+x)
    else return x
}
  
def solucion = comprobar(20)

//print(solucion)

// Da de solucion 232792560 en el compilador de scasite