# Programa en Python que cree una función lambda que sume 15 a cualquier número que se le pase como argumento.
 
import random  #genera numeros aleatorios

suma = lambda x: x + 15
print(suma(8))

#Programa que crea una función lambda que multiplique el argumento de entrada x con el argumento de entrada y.
multiplicacion = lambda x, y: x * y
print(multiplicacion(5, 6))

#Función lambda que divida el valor de entrada x, entre un número aleatorio 
division = lambda x: x / random.randint(1, 10)
print(division(10))
