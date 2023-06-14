
import java.util.Scanner; // Se importa la clase Scanner para poder leer los datos ingresados por el usuario
import java.util.Queue; // Se importa la clase Queue para poder crear la cola
import java.util.Stack; // Se importa la clase Stack para poder crear la pila
import java.util.LinkedList; // Se importa la clase LinkedList para poder crear la cola
import java.util.concurrent.TimeUnit; // Se importa la clase TimeUnit para poder usar el metodo sleep


/*Se tienen dos ferris Portos y Celebrian, en donde Portos almacena los autos en Pila y Celebrian los almacena en forma de Cola.
Crea un programa en java que realice las siguientes operaciones.
Lea la matrícula del auto (cadena alfanumérica) y en cuál de los ferris irá (P o C).
Considera que la capacidad máxima de cada ferri es de 10 autos, por lo que deberás validar que se cumpla con esta restricción.
Después de cada inserción, imprime el contenido de Portos y Celebrian.
Cuando los ferris completen su viaje (el cual deberá simularse) los autos saldrán de acuerdo con la estructura implementada para cada caso.
Cada vez que salga un auto, deberá imprimirse el contenido restante de cada ferri. */


// Se crea la clase Ferrys

public class Barcos { 
    public static void main(String[]args) throws InterruptedException{ // Se crea el metodo main y se agrega la excepcion InterruptedException para poder usar el metodo sleep
        Stack<String> portos = new Stack<>(); // Se crea la pila portos
        Queue<String> celebrian = new LinkedList<>(); // Se crea la cola celebrian
        Scanner sc= new Scanner(System.in); // Se crea el objeto sc de la clase Scanner para poder leer los datos ingresados por el usuario

        System.out.println("\nBeeenvenido al puejto de Veracru \n");
        System.out.println("\nLos ferris disponibles son: \n");
        System.out.println("\n1. El ferry Portos con direccio al puejto de Baja Califonia Su \n");
        System.out.println("\n2. El ferry Celebrian con direccio al puejto de Salina Cru \n");
        
        // Se crea el ciclo while que se ejecutara mientras la pila portos y la cola celebrian no esten llenas
        while(true){ 
            System.out.println("\nIngrese la matricula del auto(o 'salir' para cancelar) \n"); // Se pide al usuario que ingrese la matricula del auto o salir para cancelar
            String matricula = sc.nextLine(); // Se lee la matricula ingresada por el usuario

            if (matricula.equals("salir")){ // Se crea la condicion que se ejecutara si el usuario ingresa salir
                break;
            }

            System.out.println("\nIngrese el ferris en el que desea que vaya el auto (P - Portos, C- Celebrian): \n"); // Se pide al usuario que ingrese el ferris en el que desea que vaya el auto
            String ferris = sc.nextLine(); // Se lee el ferris ingresado por el usuario

            if (ferris.equalsIgnoreCase("P")){ // Se crea la condicion que se ejecutara si el usuario ingresa P para mandar el auto a la pila portos
                if (portos.size() < 10){ // Se crea la condicion que se ejecutara si la pila portos no esta llena
                    portos.push(matricula); // Se agrega la matricula ingresada por el usuario a la pila portos
                    System.out.println("\nEl auto con matricula " + matricula + " ha entrado al Ferry Portos \n"); 
                    System.out.println("\nLos autos que estan en el Ferry Portos son: \n");
                    System.out.println(portos); // Se imprime el contenido de la pila portos
                    System.out.println("\nLos autos que estan en el Ferry Celebrian son: \n");
                    System.out.println(celebrian); // Se imprime el contenido de la cola celebrian
                }
                else{   // Se crea la condicion que se ejecutara si la pila portos esta llena
                    System.out.println("\nCapacidad maxima de Portos alcanzada. No ha podido ingresar el auto. \n");
                }
            }
            else if (ferris.equalsIgnoreCase("C")){ // Se crea la condicion que se ejecutara si el usuario ingresa C para mandar el auto a la cola celebrian
                if (celebrian.size() < 10){
                    celebrian.offer(matricula); // Se agrega la matricula ingresada por el usuario a la cola celebrian
                    System.out.println("\nEl auto con matricula " + matricula + " ha entrado al Ferry Celebrian \n");
                    System.out.println("\nLos autos que estan en el Ferry Portos son: \n");
                    System.out.println(portos); // Se imprime el contenido de la pila portos
                    System.out.println("\n Los autos que estan en el Ferry Celebrian son: \n");
                    System.out.println(celebrian); // Se imprime el contenido de la cola celebrian
                }
                else{ // Se crea la condicion que se ejecutara si la cola celebrian esta llena
                    System.out.println("\nCapacidad maxima de Celebrian alcanzada. No ha podido ingresar el auto \n");
                }
            }
            else{ // Se crea la condicion que se ejecutara si el usuario ingresa una opcion invalida
                System.out.println("\nOpcion invalida. Ingrese P para mandar el auto a Portos o C para el Celebrian \n");
            }


        }
        
        System.out.println("\nIniciando el viaje de ambos ferrys...\n");
        //Codigo para la animacion del viaje de los ferrys 
        String velas1 = "     \u2571\u23AA \u23AA\u2572";
        String velas2 = "    \u2571 \u23AA \u23AA \u2572";
        String velas3 = "   \u2571__\u23AA \u23AA__\u2572";
        String mastiles = "      \u23AA \u23AA";
        String timonel = "  \u2599\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u259f";
        System.out.print("\033[H\033[2J");
        System.out.print("\033[11;0H" + "\033[0;34;44m" + "\u2588".repeat(80) + "\033[0m");
        
        for (int i = 0; i < 20; i++) {
            int v = i + 1;
            System.out.print("\033[6;" + v + "H" + velas1);
            System.out.print("\033[7;" + v + "H" + velas2);
            System.out.print("\033[8;" + v + "H" + velas3);
            System.out.print("\033[9;" + v + "H" + mastiles);
            System.out.print("\033[10;" + v + "H" + timonel);
            TimeUnit.MILLISECONDS.sleep(500);
        }
        
        int i = 19;
        
        while (i > 0) {
            int v = i + 1;
            System.out.print("\033[6;" + v + "H" + velas1 + "\033[0K");
            System.out.print("\033[7;" + v + "H" + velas2 + "\033[0K");
            System.out.print("\033[8;" + v + "H" + velas3 + "\033[0K");
            System.out.print("\033[9;" + v + "H" + mastiles + "\033[0K");
            System.out.print("\033[10;" + v + "H" + timonel + "\033[0K");
            i--;
            TimeUnit.MILLISECONDS.sleep(500);
        }

        System.out.println("\n\nLos ferrys han llegado a su destino...\n\n");

        while (!portos.isEmpty()){ // Se crea la condicion que se ejecutara mientras la pila portos no este vacia
            //Se imprime el auto que sale de la pila portos
            System.out.println("\nEl auto con matricula " + portos.pop() + " ha salido del Ferry Portos \n");
            //Se imprimen los autos que quedan en la pila portos y en la cola celebrian
            System.out.println("\nLos autos que estan en el Ferry Portos son: \n");
            System.out.println(portos);
            //Se imprimen los autos que quedan en la cola celebrian
            System.out.println("\nLos autos que estan en el Ferry Celebrian son: \n");
            System.out.println(celebrian);
        }

        while (!celebrian.isEmpty()){ // Se crea la condicion que se ejecutara mientras la cola celebrian no este vacia
            //Se imprime el auto que sale de la cola celebrian
            System.out.println("\nEl auto con matricula " + celebrian.poll() + " ha salido del Ferry Celebrian \n");
            //Se imprimen los autos que quedan en la pila portos y en la cola celebrian
            System.out.println("\nLos autos que estan en el Ferry Portos son: \n");
            System.out.println(portos);
            //Se imprimen los autos que quedan en la cola celebrian
            System.out.println("\nLos autos que estan en el Ferry Celebrian son: \n");
            System.out.println(celebrian);
        }

        System.out.println("\nTodos los autos han salido \n");
        System.out.println("\nFin del viaje de ambos ferrys...\n");

    }
}