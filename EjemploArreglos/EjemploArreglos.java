
public class EjemploArreglos{
    public static void main(String[] args) {

        System.out.println("\nIngrese el tamaño del arreglo: \n");
        int tam = Integer.parseInt(System.console().readLine());
        Arreglos arr1 = new Arreglos(tam);
        Arreglos arr2 = new Arreglos(tam);
        Arreglos arr3 = new Arreglos(tam);
        double resultado_producto_punto = 0;

        arr1.llenarArreglo();
        arr2.llenarArreglo();

        System.out.println("\nArreglo 1\n");
        arr1.imprimirArreglo();
        System.out.println("\nArreglo 2\n");
        arr2.imprimirArreglo();

        System.out.println("\nElemento maximo del arreglo 1\n");
        arr1.obtener_elemento_maximo();
        System.out.println("\nElemento minimo del arreglo 1\n");
        arr1.obtener_elemento_minimo();

        System.out.println("\nElemento maximo del arreglo 2\n");
        arr2.obtener_elemento_maximo();
        System.out.println("\nElemento minimo del arreglo 2\n");
        arr2.obtener_elemento_minimo();

        System.out.println("\nSuma de los elementos de los elementos del arreglo1\n");
        arr1.obtener_suma();
        System.out.println("\nSuma de los elementos de los elementos del arreglo2\n");
        arr2.obtener_suma();

        System.out.println("\nArreglo formado por la suma de los elementos con la misma posicion en dos arreglos\n");
        arr3.arreglo = arr1.sumar_dos_arreglos(arr1.arreglo, arr2.arreglo);
        arr3.imprimirArreglo();
        
        System.out.println("\nProducto punto de dos arreglos\n");
        resultado_producto_punto = arr1.producto_punto(arr1.arreglo, arr2.arreglo,resultado_producto_punto);
        System.out.println("El producto punto es: " + resultado_producto_punto);

        System.out.println("\nArreglo 1 ordenado \n");
        arr1.ordenar_arreglo();
        arr1.imprimirArreglo();

        System.out.println("\nArreglo 2 ordenado \n");
        arr2.ordenar_arreglo();
        arr2.imprimirArreglo();

        System.out.println("\nMedia del arreglo 1\n");
        arr1.media_arreglo();
        System.out.println("\nMedia del arreglo 2\n");
        arr2.media_arreglo();


    }
}
    
