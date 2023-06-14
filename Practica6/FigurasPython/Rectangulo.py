from Figuras import Figuras


class Rectangulo(Figuras):

    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        return self.base * self.altura

    def perimetro(self):
        return (2 * self.base) + (2 * self.altura)

    def __str__(self):
        return "Rectangulo de base: " + str(self.base) + " y altura: " + str(self.altura)
