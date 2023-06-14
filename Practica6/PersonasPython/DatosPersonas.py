from Estudiante import Estudiante
from Docente import Docente
from PAAE import PAAE

class DatosPersonas:
    def __init__(self):
        self.Estudiantes = None
        self.Docentes = None
        self.PAAEs = None

    def ingresar_datos_persona(self, tipo_persona):
        ID = input("ID: ")
        Nombre = input("Nombre: ")
        CURP = input("CURP: ")
        Domicilio = input("Domicilio: ")

        if tipo_persona == 1:
            self.Estudiantes = Estudiante(ID, Nombre, CURP, Domicilio)
        elif tipo_persona == 2:
            self.Docentes = Docente(ID, Nombre, CURP, Domicilio)
        elif tipo_persona == 3:
            self.PAAEs = PAAE(ID, Nombre, CURP, Domicilio)

    def obtener_informacion_persona(self, tipo_persona):
        persona_seleccionada = None

        if tipo_persona == 1:
            persona_seleccionada = self.Estudiantes
        elif tipo_persona == 2:
            persona_seleccionada = self.Docentes
        elif tipo_persona == 3:
            persona_seleccionada = self.PAAEs
        else:
            persona_seleccionada = None

        if persona_seleccionada is not None:
            print("\nLa información de la persona seleccionada es:")
            print("ID: ", persona_seleccionada.getID())
            print("Nombre: ", persona_seleccionada.getNombre())
            print("CURP: ", persona_seleccionada.getCURP())
            print("Domicilio: ", persona_seleccionada.getDomicilio())
        else:
            print("Esa opción no es válida")

    def ejecutar(self):
        otra_persona = True

        print("B I E N V E N I D O")
        while otra_persona:
            print("Seleccione la persona a la que desea agregar datos:")
            print("1. Estudiante")
            print("2. Docente")
            print("3. PAAE")
            opc = int(input())

            print("Ingrese los datos de la persona:")
            self.ingresar_datos_persona(opc)

            print("\n¿Desea agregar otro tipo de persona?")
            print("Presione 1 para sí y 0 para no")
            resp = input()
            otra_persona = resp == "1"

        print("\nM E N U")
        print("Seleccione la opción que desee")
        print("1. Obtener información estudiante")
        print("2. Obtener información docente")
        print("3. Obtener información PAAE")
        opc_menu = int(input())

        self.obtener_informacion_persona(opc_menu)

datos_personas = DatosPersonas()
datos_personas.ejecutar()
