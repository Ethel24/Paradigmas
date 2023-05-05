public class Arreglos {
    double[] arreglo;
    public Arreglos(int n)
    {
        arreglo = new double[n];
    }

    public void llenarArreglo()
    {
        for(int i = 0; i < arreglo.length; i++)
        {
            //Se llena con numeros aleatorios entre 0 y 100 con dos decimales
            arreglo[i] = (double) (Math.random() * 100);
           
        }
    }

    public void imprimirArreglo()
    {
       /* for(int i = 0; i < arreglo.length; i++)
        {
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }
        */

        for(double x: arreglo)
        {
            System.out.println("Elemento -> " + x);
        }
    }

    public double [] devolverArreglo()
    {
        return arreglo;
    }

    public void obtener_elemento_maximo()
    {
        double max = arreglo[0];
        for(int i = 1; i < arreglo.length; i++)
        {
            if(arreglo[i] > max)
            {
                max = arreglo[i];
            }
        }
        System.out.println("El elemento maximo es: " + max);
    }

    public void obtener_elemento_minimo()
    {
        double min = arreglo[0];
        for(int i = 1; i < arreglo.length; i++)
        {
            if(arreglo[i] < min)
            {
                min = arreglo[i];
            }
        }
        System.out.println("El elemento minimo es: " + min);
    }

    public void obtener_suma()
    {
        double suma = 0;
        for(int i = 0; i < arreglo.length; i++)
        {
            suma += arreglo[i];
        }
        System.out.println("La suma es: " + suma);
    }

    public double[] sumar_dos_arreglos(double [] arreglo1 , double [] arreglo2)
    {
        double [] arreglo3 = new double [arreglo1.length];
        for(int i = 0; i < arreglo1.length; i++)
        {
            arreglo3[i] = arreglo1[i] + arreglo2[i];
        }
        return arreglo3;
    }

    public double producto_punto (double [] arreglo1 , double [] arreglo2,double resultado_producto_punto)
    {
        //El producto punto es la suma de los productos de los elementos de los arreglos
        for(int i = 0; i < arreglo1.length; i++)
        {
            resultado_producto_punto += arreglo1[i] * arreglo2[i];
        }
        return resultado_producto_punto;
        
    }
    
    //Se utiliza Arrays.sort(arreglo) para ordenar el arreglo proporcionado
    public void ordenar_arreglo()
    {
        java.util.Arrays.sort(arreglo);
    }

    public void media_arreglo()
    {
        double suma = 0;
        for(int i = 0; i < arreglo.length; i++)
        {
            suma += arreglo[i];
        }
        System.out.println("La media es: " + suma/arreglo.length);
    }

    
}

