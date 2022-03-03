package me.javgar01.pene;

public class Persona {

    private String dni;
    private String nombre;
    private String getApellidos;
    private int edad;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.setDni(dni);
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setEdad(edad);
    }


    public void setDni(String dni){
        this.dni = dni;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.getApellidos = apellidos;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }


    public String getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return getApellidos;
    }
    public int getEdad(){
        return edad;
    }


    public void imprime(){
        System.out.println("DNI: " + getDni() + "\nNombre: " + getNombre() + "\nApellidos: " + getApellidos() + "\nEdad: " + getEdad() + "\n");
    }
    public boolean esMayorEdad(){
        if(getEdad() > 17){
            return true;
        } else return false;
    }

    public int diferenciaEdad(Persona p){
        
    }
}
