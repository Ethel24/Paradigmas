//Padilla Rodríguez Ethel y Rendón Sierra Carlos Alexis

public class EjercicioMatrices {
    public static void main(String[] args) {
        //Se le pregunta al usuario el numero de filas y columnas de la matriz
        System.out.println("Ingrese el numero de filas de la matriz");
        int filas = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el numero de columnas de la matriz");
        int columnas = Integer.parseInt(System.console().readLine());
        //Se crea la matriz con los datos proporcionados por el usuario
        Matrices matriz1 = new Matrices(filas, columnas);
        Matrices matriz2 = new Matrices(filas, columnas);
        Matrices matriz3 = new Matrices(filas, columnas);
        Matrices matriz4 = new Matrices(filas, columnas);
        Matrices matriz5 = new Matrices(filas, columnas);
        //Se llena la matriz con numeros aleatorios
        matriz1.llenarMatriz();
        matriz2.llenarMatriz();
        //Se imprime la matriz
        System.out.println("\nMatriz 1\n");
        matriz1.imprimirMatriz();
        System.out.println("\nMatriz 2\n");
        matriz2.imprimirMatriz();
        //Se obtiene el elemento maximo de la matriz
        System.out.println("\nElemento maximo de la matriz 1");
        matriz1.obtener_elemento_maximo();
        System.out.println("\nElemento maximo de la matriz 2");
        matriz2.obtener_elemento_maximo();
        //Se obtiene el elemento minimo de la matriz
        System.out.println("\nElemento minimo de la matriz 1");
        matriz1.obtener_elemento_minimo();
        System.out.println("\nElemento minimo de la matriz 2");
        matriz2.obtener_elemento_minimo();
        //Se suman las matrices
        System.out.println("\nSuma de las matrices\n");
        matriz3.matriz = matriz1.sumar_dos_matrices(matriz1.devolverMatriz(), matriz2.devolverMatriz());
        matriz3.imprimirMatriz();
        //Se restan las matrices
        System.out.println("\nResta de las matrices\n");
        matriz4.matriz = matriz1.restar_dos_matrices(matriz1.devolverMatriz(), matriz2.devolverMatriz());
        matriz4.imprimirMatriz();
        //Se multiplican las matrices
        System.out.println("\nMultiplicacion de las matrices\n");
        matriz5.matriz = matriz1.multiplicar_dos_matrices(matriz1.devolverMatriz(), matriz2.devolverMatriz());
        matriz5.imprimirMatriz();
        
    }
}

