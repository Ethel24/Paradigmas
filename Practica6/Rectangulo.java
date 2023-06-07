package com.mycompany.practica6;


class Rectangulo extends Figuras {
    double base;
    double altura;
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    double area() {
        return base * altura;
    }

    @Override
    double perimetro() {
        return base + base + altura + altura;
        
    }
    
}
    



    
