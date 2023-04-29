//Ejercicio de Laboratorio #3.2
//Integrantes: Carlos Alexis Rendon Sierra y Ethel Padilla Rodriguez 
//Fecha de entrega: 28/04/23
//Desarrolla en Java una clase llamada Calculadora, la cual tendrá como atributos un par de datos de tipo entero, float y doble (revisa el ejemplo estudiado en clase).
//Inicializa los valores de esos datos con valores fijos, en una primera versión del constructor de la clase.
//Crea una segunda versión del constructor que reciba como argumentos los datos que se usarán para inicializar los tipos de datos enteros, float y double.
//Implementa los métodos sobrecargados de suma y resta para lo que son valores enteros, float, y double.
//Implementa un método para multiplicación de enteros empleado el algoritmo de las sumas sucesivas.
//Implementa un método para dividir enteros empleando el algoritmo de las restas sucesivas.
//Implementa métodos sobrecargados para multiplicar y dividir empleando float y double.
//Implementa un método de cálculo del módulo empleando valores enteros.

public class Calculadora { // Definición de la clase Calculadora con sus atributos y métodos sobrecargados
                           // Se les llama métodos sobrecargados porque tienen el mismo nombre pero
                           // diferentes argumentos
                           // para realizar las operaciones de suma, resta, multiplicación y división de
                           // números enteros, flotantes y dobles.
    // Atributos de la clase Calculadora con sus respectivos tipos de datos.
    // Se define un par de datos de tipo entero, float y doble.
    int entero1;
    int entero2;
    float flotante1;
    float flotante2;
    double doble1;
    double doble2;

    public Calculadora() { // Constructor de la clase Calculadora que inicializa los valores de los
                           // atributos con valores fijos.
        // Se utiliza f para indicar que el valor es de tipo float.
        entero1 = 10;
        entero2 = 4;
        flotante1 = 1.5f;
        flotante2 = 2.5f;
        doble1 = 10.5;
        doble2 = 5.5;
    }

    // Constructor de la clase Calculadora que recibe como argumentos los datos que
    // se usarán para inicializar los tipos de datos enteros, float y double.
    // En esta funcion se reciben los datos del primer constructor y se inicializan
    // los atributos con los valores recibidos.
    public Calculadora(int e1, int e2, float f1, float f2, double d1, double d2) {
        entero1 = e1;
        entero2 = e2;
        flotante1 = f1;
        flotante2 = f2;
        doble1 = d1;
        doble2 = d2;
    }

    public int suma(int entero1, int entero2) { // Método sobrecargado para realizar la suma de dos números enteros.
        return entero1 + entero2; // Se retorna la suma de los dos números enteros.
    }

    public float suma(float flotante1, float flotante2) { // Método sobrecargado para realizar la suma de dos números
                                                          // flotantes.
        return flotante1 + flotante2; // Se retorna la suma de los dos números flotantes.
    }

    public double suma(double doble1, double doble2) { // Método sobrecargado para realizar la suma de dos números
                                                       // dobles.
        return doble1 + doble2; // Se retorna la suma de los dos números dobles.
    }

    public int resta(int entero1, int entero2) { // Método sobrecargado para realizar la resta de dos números enteros.
        return entero1 - entero2; // Se retorna la resta de los dos números enteros.
    }

    public float resta(float flotante1, float flotante2) { // Método sobrecargado para realizar la resta de dos números
                                                           // flotantes.
        return flotante1 - flotante2; // Se retorna la resta de los dos números flotantes.
    }

    public double resta(double doble1, double doble2) { // Método sobrecargado para realizar la resta de dos números
                                                        // dobles.
        return doble1 - doble2; // Se retorna la resta de los dos números dobles.
    }

    public int multiplicacion(int entero1, int entero2) { // Método sobrecargado para realizar la multiplicación de dos
                                                          // números enteros.
        int resultado = 0; // Se inicializa la variable resultado con un valor de 0.
        for (int i = 0; i < entero2; i++) { // Se realiza un ciclo for para realizar la multiplicación de los dos
                                            // números enteros.
            resultado = suma(resultado, entero1); // Se llama al método suma para realizar la multiplicación de los dos
                                                  // números enteros.
            // Se utiliza el metodo de sumas sucesivas para realizar la multiplicación de
            // los dos números enteros.
        }
        return resultado; // Se retorna el resultado de la multiplicación de los dos números enteros.
    }

    public float multiplicacion(float flotante1, float flotante2) { // Método sobrecargado para realizar la
                                                                    // multiplicación de dos números flotantes.
        return flotante1 * flotante2; // Se retorna la multiplicación de los dos números flotantes.
    }

    public double multiplicacion(double doble1, double doble2) { // Método sobrecargado para realizar la multiplicación
                                                                 // de dos números dobles.
        return doble1 * doble2; // Se retorna la multiplicación de los dos números dobles.
    }

    public int division(int entero1, int entero2) { // Método sobrecargado para realizar la división de dos números enteros.
        //Comprobar que el divisor no sea 0
        if (entero2 == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        else{
            int resultado = 0; // Se inicializa la variable resultado con un valor de 0.
            while (entero1 >= entero2) { // Se realiza un ciclo while para realizar la división de los dos números
                                        // enteros.
                entero1 = resta(entero1, entero2); // Se llama al método resta para realizar la división de los dos números
                                                // enteros.
                resultado++; // Se incrementa el valor de la variable resultado.
            }
            return resultado; // Se retorna el resultado de la división de los dos números enteros.
        }
        // Se utiliza el metodo de restas sucesivas para realizar la división de los dos
        // números enteros.

    }

    public float division(float flotante1, float flotante2) { // Método sobrecargado para realizar la división de dos números flotantes.
        //Comprobar que el divisor no sea 0
        if (flotante2 == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        else
            return flotante1 / flotante2; // Se retorna la división de los dos números flotantes.
    }

    public double division(double doble1, double doble2) { // Método sobrecargado para realizar la división de dos números dobles.
        //Comprobar que el divisor no sea 0
        if (doble2 == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        else    
            return doble1 / doble2; // Se retorna la división de los dos números dobles.
    }

    public int modulo(int entero1, int entero2) { // Método sobrecargado para realizar el módulo de dos números enteros.
        //Comprobar que el divisor no sea 0
        if (entero2 == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        else{
            while (entero1 >= entero2) { // Se realiza un ciclo while para realizar el módulo de los dos números enteros.
                entero1 = resta(entero1, entero2); // Se llama al método resta para realizar el módulo de los dos números
                                                // enteros.
            }
            return entero1; // Se retorna el módulo de los dos números enteros.
            // Se utiliza el metodo de restas sucesivas para realizar el módulo de los dos
            // números enteros.
        }
    }

    @Override // Se sobreescribe el método toString para mostrar los valores de los atributos.
    public String toString() { 
        //Se retorna una cadena con los valores de los atributos.
        return "Calculadora{" + "entero 1 = " + entero1 + ", entero2 = " + entero2 + ", flotante1 = " + flotante1
                + ", flotante2 = " + flotante2 + ", doble1 = " + doble1 + ", doble2 = " + doble2 + '}'; 
    }

    // Método main para probar los métodos de la clase Calculadora. 
    public static void main(String[] args) {
        // Se crea un objeto de la clase Calculadora.
        Calculadora calculadora = new Calculadora(); 
        //Se imprime el objeto de la clase Calculadora llamando al método toString.
        System.out.println(calculadora);
        //Se llama a la función suma para realizar la suma de los números enteros y retorna e imprime el resultado.
        System.out.println("Suma de enteros: " + calculadora.suma(calculadora.entero1, calculadora.entero2));
        //Se llama a la función suma para realizar la suma de los números flotantes y retorna e imprime el resultado.
        System.out.println("Suma de flotantes: " + calculadora.suma(calculadora.flotante1, calculadora.flotante2));
        //Se llama a la función suma para realizar la suma de los números dobles y retorna e imprime el resultado.
        System.out.println("Suma de dobles: " + calculadora.suma(calculadora.doble1, calculadora.doble2));
        //Se llama a la función resta para realizar la resta de los números enteros y retorna e imprime el resultado.
        System.out.println("Resta de enteros: " + calculadora.resta(calculadora.entero1, calculadora.entero2));
        //Se llama a la función resta para realizar la resta de los números flotantes y retorna e imprime el resultado.
        System.out.println("Resta de flotantes: " + calculadora.resta(calculadora.flotante1, calculadora.flotante2));
        //Se llama a la función resta para realizar la resta de los números dobles y retorna e imprime el resultado.
        System.out.println("Resta de dobles: " + calculadora.resta(calculadora.doble1, calculadora.doble2));
        //Se llama a la función multiplicación para realizar la multiplicación de los números enteros y retorna e imprime el resultado.
        System.out.println("Multiplicación de enteros: " + calculadora.multiplicacion(calculadora.entero1, calculadora.entero2));
        //Se llama a la función multiplicación para realizar la multiplicación de los números flotantes y retorna e imprime el resultado.
        System.out.println("Multiplicación de flotantes: " + calculadora.multiplicacion(calculadora.flotante1, calculadora.flotante2));
        //Se llama a la función multiplicación para realizar la multiplicación de los números dobles y retorna e imprime el resultado.
        System.out.println("Multiplicación de dobles: " + calculadora.multiplicacion(calculadora.doble1, calculadora.doble2));
        //Se llama a la función división para realizar la división de los números enteros y retorna e imprime el resultado.
        System.out.println("División de enteros: " + calculadora.division(calculadora.entero1, calculadora.entero2));
        //Se llama a la función división para realizar la división de los números flotantes y retorna e imprime el resultado.
        System.out.println("División de flotantes: " + calculadora.division(calculadora.flotante1, calculadora.flotante2));
        //Se llama a la función división para realizar la división de los números dobles y retorna e imprime el resultado.
        System.out.println("División de dobles: " + calculadora.division(calculadora.doble1, calculadora.doble2));
        //Se llama a la función módulo para realizar el módulo de los números enteros y retorna e imprime el resultado.
        System.out.println("Módulo de enteros: " + calculadora.modulo(calculadora.entero1, calculadora.entero2));

    }

}
