
from Circulo import Circulo
from Rectangulo import Rectangulo
from Triangulo import Triangulo
from Hexagono import Hexagono

print("Bienvenido a la calculadora para figuras")

while True:
    print("Elija de qué figura desea calcular el área y el perímetro")
    print("1. Triángulo")
    print("2. Círculo")
    print("3. Rectángulo")
    print("4. Hexágono")
    print("0. Salir")

    opcion = int(input("Ingrese la opción que desea: "))

    if opcion == 1:
        base = float(input("Teclee la base del triángulo: "))
        altura = float(input("Teclee la altura del triángulo: "))
        lado1 = float(input("Teclee el primer lado del triángulo: "))
        lado2 = float(input("Ingrese el segundo lado del triángulo: "))
        lado3 = float(input("Ingrese el tercer lado del triángulo: "))
        triangulo = Triangulo(base, altura, lado1, lado2, lado3)
        print(triangulo)
        print("El área del triángulo es:", triangulo.area())
        print("El perímetro del triángulo es:", triangulo.perimetro())
        print("")
        print("")
        print("")
        print("")

    elif opcion == 2:
        radio = float(input("Teclee el radio del círculo: "))
        circulo = Circulo(radio)
        print(circulo)
        print("El área del círculo es:", circulo.area())
        print("El perímetro del círculo es:", circulo.perimetro())
        print("")
        print("")
        print("")
        print("")

    elif opcion == 3:
        base = float(input("Teclee la base del rectángulo: "))
        altura = float(input("Teclee la altura del rectángulo: "))
        rectangulo = Rectangulo(base, altura)
        print(rectangulo)
        print("El área del rectángulo es:", rectangulo.area())
        print("El perímetro del rectángulo es:", rectangulo.perimetro())
        print("")
        print("")
        print("")
        print("")

    elif opcion == 4:
        lado = float(input("Teclee el valor de un lado del hexágono: "))
        apotema = float(input("Teclee el valor del apotema: "))
        hexagono = Hexagono(lado, apotema)
        print(hexagono)
        print("El área del hexágono es:", hexagono.area())
        print("El perímetro del hexágono es:", hexagono.perimetro())
        print("")
        print("")
        print("")
        print("")

    elif opcion == 0:
        print("Gracias por usar la calculadora de figuras")
        break

    else:
        print("Opción inválida")
        print("")
        print("")
        print("")
        print("")  
