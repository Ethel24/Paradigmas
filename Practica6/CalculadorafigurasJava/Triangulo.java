package com.mycompany.practica6;


class Triangulo extends Figuras{
    double base;
    double altura;
    double lado1;
    double lado2;
    double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3){
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override
    double area() {
        return(base * altura)/2;
    }

    @Override
    double perimetro() {
        return lado1 + lado2 + lado3;
      
    }
}
    



    
