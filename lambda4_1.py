#La funcion recibe un argumento n y realiza una multiplicaión por un numero denotado por x
def func_compute(n):
    return lambda x : x *n
#La funcion  func_compute multiplicará cualquier numero por 2 y se guarda en result 
result = func_compute(2)
#Se llama a la funcion result y se le pasa el argumento 15
#Multiplica 15 por 2 y lo imprime
print("Double the number of 15 =", result(15))