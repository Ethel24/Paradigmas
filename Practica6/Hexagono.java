package com.mycompany.practica6;


class Hexagono extends Figuras{
    double lado;
    double apotema;
    
    public Hexagono(double lado, double apotema){
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    double area() {
        return ((6 * lado) * apotema)/2;
    }

    @Override
    double perimetro() {
        return 6 * lado;
    }

}

