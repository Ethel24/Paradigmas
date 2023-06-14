package com.mycompany.datospersonas;

//clase docente que implementa la interfaz de persona
public class Docente  implements Persona{
    String ID;
    String Nombre;
    String CURP;
    String Domicilio;
    
    public Docente(String ID, String Nombre, String CURP, String Domicilio){
        this.ID = ID;
        this.Nombre = Nombre;
        this.CURP = CURP;
        this.Domicilio = Domicilio;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public String getCURP() {
        return CURP;
    }

    @Override
    public String getDomicilio() {
        return Domicilio;
    }
    
    
}
