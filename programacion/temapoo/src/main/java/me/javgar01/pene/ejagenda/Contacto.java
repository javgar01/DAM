package me.javgar01.pene.ejagenda;

public class Contacto {
    
    public Contacto(String nombre, int tlf) {
        this.nombre = nombre;
        this.tlf = tlf;
    }
    
    String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    int tlf;

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public int getTlf() {
        return tlf;
    }

    @Override
    public String toString() {
        return ("Nombre: " + nombre + "\n Tlf: " + tlf);
    }
}