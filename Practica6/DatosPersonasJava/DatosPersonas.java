package com.mycompany.datospersonas;

import java.util.Scanner;

/**
 *
 * @author ethel
 */
public class DatosPersonas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variables para almacenar los datos ingresados por el usuario
        String ID;
        String Nombre;
        String CURP;
        String Domicilio;
        
        // Variables para almacenar los datos de las personas
        Persona Estudiantes = null;
        Persona Docentes = null;
        Persona PAAEs = null;
        //Variable para controlar si se desea agregar datos de otra persona
        boolean otraPersona = true;
        
        System.out.println("B I E N V E N I D O");
        while(otraPersona){
            System.out.println("Seleccione la persona a la que desea agregar datos:");
            System.out.println("1. Estudiante");
            System.out.println("2. Docente");
            System.out.println("3. PAAE");
            int opc = scanner.nextInt();
            
            //Pedimos los datos de la persona 
            System.out.println("Ingrese los datos de la persona:");
            System.out.print("ID: ");
            scanner.nextLine();
            ID = scanner.nextLine();
            System.out.print("Nombre: ");
            Nombre = scanner.nextLine();
            System.out.print("CURP: ");
            CURP = scanner.nextLine();
            System.out.print("Domicilio: ");
            Domicilio = scanner.nextLine();
            
            //creamoas la instancia de la opcion seleccionada
            switch (opc) {
                case 1:
                    Estudiantes = new Estudiante(ID, Nombre, CURP, Domicilio);
                    break;
                case 2:
                    Docentes = new Docente(ID, Nombre, CURP, Domicilio);
                    break;
                case 3:
                    PAAEs = new PAAE(ID, Nombre, CURP, Domicilio);
                    break;
                default:
                    break;
            }
            
            //Preguntamos si quiere a agregar a otra persona
            System.out.println("\n ¿Desea agregar otro tipo de persona?");
            System.out.println("Presione 1 para si y 0 para no");
            String resp = scanner.nextLine();
            otraPersona = resp.equals("1");
        }
        
        System.out.println("\nM E N U");
        System.out.println("Seleccione la opcion que desee");
        System.out.println("1. Obtener informacion estudiante");
        System.out.println("2. Obtener información docente");
        System.out.println("3. Obtener información PAAE");
        int opcMenu = scanner.nextInt();
 
        //obtener la informacion de la persona seleccionada
        Persona personSelect = null;
        switch (opcMenu) {
            case 1:
                personSelect = Estudiantes;
                break;
            case 2:
                personSelect = Docentes;
                break;
            case 3:
                personSelect = PAAEs;
                break;
            default:
                break;
        }
        
        //Mostramos la informacion de la persona seleccionada  
        if(personSelect != null){
            System.out.println("\nLa informacion de la persona que selecionó es: ");
            System.out.println("ID: " +personSelect.getID());
            System.out.println("Nombre: " +personSelect.getNombre());
            System.out.println("CURP: " +personSelect.getCURP());
            System.out.println("Domicilio: " +personSelect.getDomicilio());
        }else{
            System.out.println("Esa opción no es válida");
        }
    }
}
