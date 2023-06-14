from Figuras import Figuras

class Hexagono(Figuras):
    def __init__(self, lado, apotema):
        self.lado = lado
        self.apotema = apotema
    
    def area(self):
        return ((6 * self.lado) * self.apotema)/2
    
    def perimetro(self):
        return 6 * self.lado
    
    def __str__(self):
        return "Hexagono de lado: " + str(self.lado) + " y apotema: " + str(self.apotema)