//Padilla Rodríguez Ethel y Rendón Sierra Carlos Alexis

public class Matrices {
    double [][] matriz;
    int filas;
    int columnas;
    public Matrices(int filas, int columnas)
    {
        matriz = new double[filas][columnas];
    }
    public void llenarMatriz()
    {
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[0].length; j++)
            {
                matriz[i][j] = (double) (Math.random() * 100);
            }
        }
    }
    //Imprimir matriz con el uso de for each 
    public void imprimirMatriz()
    {
        for(double [] x: matriz)
        {
            for(double y: x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public void obtener_elemento_maximo()
    {
        double max = matriz[0][0];
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[0].length; j++)
            {
                if(matriz[i][j] > max)
                {
                    max = matriz[i][j];
                }
            }
        }
        System.out.println("El elemento maximo es: " + max);
    }

    public void obtener_elemento_minimo()
    {
        double min = matriz[0][0];
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[0].length; j++)
            {
                if(matriz[i][j] < min)
                {
                    min = matriz[i][j];
                }
            }
        }
        System.out.println("El elemento minimo es: " + min);
    }

    //Se devuelve el atributo matriz
    public double [][] devolverMatriz()
    {
        return matriz;
    }

    //Suma de dos matrices de igual dimension que se guardara en una nueva matriz
    public double [][] sumar_dos_matrices (double [][] matriz1, double [][] matriz2)
    {
        double [][] matriz3 = new double [matriz1.length][matriz1[0].length];
        for(int i = 0; i < matriz3.length; i++)
        {
            for(int j = 0; j < matriz3[0].length; j++)
            {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matriz3;
    }

    //Resta de dos matrices de igual dimension que se guardara en una nueva matriz
    public double [][] restar_dos_matrices (double [][] matriz1, double [][] matriz2)
    {
        double [][] matriz4 = new double[matriz1.length][matriz1[0].length];
        for(int i = 0; i < matriz4.length; i++)
        {
            for(int j = 0; j < matriz4[0].length; j++)
            {
                matriz4[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return matriz4;
    }

    //Multiplicacion de dos matrices de igual dimension que se guardara en una nueva matriz
    public double [][] multiplicar_dos_matrices (double [][] matriz1, double [][] matriz2)
    {
        double [][] matriz5 = new double[matriz1.length][matriz1[0].length];
        for(int i = 0; i < matriz5.length; i++)
        {
            for(int j = 0; j < matriz5[0].length; j++)
            {
                matriz5[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        return matriz5;
    }

}
