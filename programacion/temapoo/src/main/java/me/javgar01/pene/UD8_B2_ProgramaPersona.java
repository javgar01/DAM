package me.javgar01.pene;

public class UD8_B2_ProgramaPersona {

    public static void main(String[] args) {

        Persona persona1 = new Persona("18999548P", "José", "Serrano Márquez", 25);
        Persona persona2 = new Persona("20222444L", "María", "Carcelén Sánchez", 17);

        String cadena1 = persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDni();
        String cadena2 = persona2.getNombre() + " " + persona2.getApellidos() + " con DNI " + persona2.getDni();

        if (persona1.getEdad() >= 18) {
            cadena1 += " es mayor de edad";
        } else {
            cadena1 += " no es mayor de edad";
        }

        if (persona2.getEdad() >= 18) {
            cadena2 += " es mayor de edad";
        } else {
            cadena2 += " no es mayor de edad";
        }

        System.out.println(cadena1);
        System.out.println(cadena2);
    }

}
