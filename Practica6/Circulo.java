package com.mycompany.practica6;


class Circulo extends Figuras{
    double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    double area() {
        return Math.PI * (radio * radio);
    }

    @Override
    double perimetro() {
        return 2 * Math.PI * radio;

    }  
}
    