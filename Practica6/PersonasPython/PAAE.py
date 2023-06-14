from Persona import Persona

class PAAE(Persona):
    def __init__(self,ID,Nombre,CURP,Domicilio):
        self.ID=ID
        self.Nombre=Nombre
        self.CURP=CURP
        self.Domicilio=Domicilio
    
    def getID(self):
        return self.ID
    
    def getNombre(self):
        return self.Nombre
    
    def getCURP(self):
        return self.CURP
    
    def getDomicilio(self): 
        return self.Domicilio
   