from Figuras import Figuras

class Triangulo(Figuras):
    def __init__(self, base, altura,lado1,lado2,lado3):
        self.base = base
        self.altura = altura
        self.lado1 = lado1
        self.lado2 = lado2
        self.lado3 = lado3
    def area(self):
        return (self.base * self.altura)/2
    def perimetro(self):
        return self.lado1 + self.lado2 + self.lado3
    def __str__(self): 
        return "Triangulo de base: " + str(self.base) + " y altura: " + str(self.altura) + " y lados: " + str(self.lado1) + ", " + str(self.lado2) + ", " + str(self.lado3)
    