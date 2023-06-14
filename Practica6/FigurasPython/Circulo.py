from Figuras import Figuras

class Circulo(Figuras):

    def __init__(self, radio):
        self.radio = radio
    def area(self):
        return 3.1416 * self.radio ** 2
    def perimetro(self):
        return 2 * 3.1416 * self.radio
    def __str__(self):
        return "Circulo de radio: " + str(self.radio)