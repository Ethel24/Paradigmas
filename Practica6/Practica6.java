package com.mycompany.practica6;

import com.mycompany.practica6.Rectangulo;
import com.mycompany.practica6.Triangulo;
import java.util.Scanner;

public class Practica6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;
        
        do{
            System.out.println("Bienvenido a la calculadora para figuras");
            System.out.println("Elija de que figura desea calcular el area y el perimetro");
            System.out.println("1. Triangulo");
            System.out.println("2. circulo");
            System.out.println("3. rectangulo");
            System.out.println("4. hexagono");
            System.out.println("0. salir");
            
            opc = scanner.nextInt();
            
            switch(opc){
                case 1 -> {
                    System.out.println("Teclee la base del triangulo");
                    double base = scanner.nextDouble();
                    System.out.println("Teclee la altura del triangulo");
                    double altura = scanner.nextDouble();
                    System.out.println("Teclee el primer lado del triangulo");
                    double lado1 = scanner.nextDouble();
                    System.out.println("Teclee el segundo lado del triangulo");
                    double lado2 = scanner.nextDouble();
                    System.out.println("Teclee el tercer lado del triangulo");
                    double lado3 = scanner.nextDouble();
                    
                    Triangulo triangulo = new Triangulo(base, altura, lado1, lado2, lado3);
                    System.out.println("El area del triangulo es: " +triangulo.area());
                    System.out.println("El perimetro del triangulo es: " +triangulo.perimetro());
                }
                    
                case 2 -> {
                    System.out.println("Teclee el radio del circulo");
                    double radio = scanner.nextDouble();
                    
                    Circulo circulo = new Circulo(radio);
                    System.out.println("El area del circulo es: " +circulo.area());
                    System.out.println("El perimetro del circulo es: " +circulo.perimetro());
                }
                    
                case 3 -> {
                    System.out.println("Teclee la base del rectangulo");
                    double base = scanner.nextDouble();
                    System.out.println("Teclee la altura del rectangulo");
                    double altura = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(base,altura);
                    System.out.println("El area del rectangulo es: " +rectangulo.area());
                    System.out.println("El perimetro del rectangulo es: " +rectangulo.perimetro());
                }
                    
                case 4 -> {
                    System.out.println("Teclee el valor de un lado del hexagono");
                    double lado = scanner.nextDouble();
                    System.out.println("Teclee el valor de la apotema");
                    double apotema = scanner.nextDouble();
                    
                    Hexagono hexagono = new Hexagono(lado, apotema);
                    System.out.println("El area del hexagono es:" +hexagono.area());
                    System.out.println("El perimetro del hexagono es: " +hexagono.perimetro());
                }
                    
                case 0 -> System.out.println("Gracias por usar el programa. Hasta luego <3");
                    
                default -> System.out.println("ESA OPCION NO ES VALIDA. Intente con otra");  
            }
        } while(opc != 0);
    }
}

