package com.mycompany.datospersonas;

//Clase PAAE que implementa la interfaz persona
public class PAAE implements Persona {
    String ID;
    String Nombre;
    String CURP;
    String Domicilio;
    
    public PAAE(String ID, String Nombre, String CURP, String Domicilio){
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
