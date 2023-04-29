#Ejercicio de Laboratorio #3.3
#Integrantes: Carlos Alexis Rendon Sierra y Ethel Padilla Rodriguez
#Fecha de entrega: 28/04/23
# Implementa en Python una versión similar de la calculadora descrita en el
# punto anterior en el programa Calculadora.java
# Inicializa los valores de los atributos desde el constructor.
# Implementa las operaciones de suma, resta, multiplicación, división y módulo.

# Se define la clase Calculadora con sus respectivos atributos y métodos para realizar las operaciones
class Calculadora:
    def __init__(self):  # Se inicializan los atributos a y b desde el constructor de la clase Calculadora llamado __init__
        self.a = 1.5  # Se inicializa el atributo a con el valor 1.5
        self.b = 3.5  # Se inicializa el atributo b con el valor 3.5

    def __str__(self): # Se define el método __str__ que retorna un string con los valores de los atributos a y b de la clase Calculadora
        return f'Numero 1: {self.a} |||| Numero 2: {self.b}'

    def sumar(self):  # Se define el método sumar que retorna la suma de los atributos a y b
        return self.a + self.b

    def restar(self):  # Se define el método restar que retorna la resta de los atributos a y b
        return self.a - self.b

    # Se define el método multiplicar que retorna la multiplicación de los atributos a y b
    def multiplicar(self):
        return self.a * self.b

    def dividir(self):  # Se define el método dividir que retorna la división de los atributos a y b
        if self.b == 0:  # Se valida que el atributo b sea diferente de cero para evitar una división entre cero lo cual es un error
            return "Error: No se puede dividir entre cero"
        else:  # Si el atributo b es diferente de cero se retorna la división de los atributos a y b
            return self.a / self.b

    def modulo(self):  # Se define el método modulo que retorna el módulo de los atributos a y b
        if self.b == 0:  # Se valida que el atributo b sea diferente de cero para evitar una división entre cero lo cual es un error
            return "Error: No se puede calcular el módulo entre cero"
        else:  # Si el atributo b es diferente de cero se retorna el módulo de los atributos a y b
            return self.a % self.b


objeto = Calculadora() # Se crea un objeto de la clase Calculadora con los valores 1.5 y 3.5 para los atributos a y b respectivamente
print(objeto) # Se imprime el objeto creado de la clase Calculadora con los valores de los atributos a y b inicializados en el constructor
# lo cual se logra gracias al método __str__ definido en la clase Calculadora que retorna un string con los valores de los atributos a y b
print(f'La suma de {objeto.a} y {objeto.b} es {objeto.sumar()}') # Se imprime la suma de los atributos a y b del objeto creado de la clase Calculadora
print(f'La resta de {objeto.a} y {objeto.b} es {objeto.restar()}') # Se imprime la resta de los atributos a y b del objeto creado de la clase Calculadora
print(f'La multiplicación de {objeto.a} y {objeto.b} es {objeto.multiplicar()}') # Se imprime la multiplicación de los atributos a y b del objeto creado de la clase Calculadora
print(f'La división de {objeto.a} y {objeto.b} es {objeto.dividir()}') # Se imprime la división de los atributos a y b del objeto creado de la clase Calculadora
print(f'El módulo de {objeto.a} y {objeto.b} es {objeto.modulo()}') # Se imprime el módulo de los atributos a y b del objeto creado de la clase Calculadora