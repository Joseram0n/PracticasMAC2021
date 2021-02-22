def solucion = (1 to 1000 map(x => BigInt(x).pow(x))).sum % BigInt(10).pow(10)

print(solucion)