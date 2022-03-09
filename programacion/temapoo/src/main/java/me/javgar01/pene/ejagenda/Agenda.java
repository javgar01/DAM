package me.javgar01.pene.ejagenda;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contacto> contacts = new ArrayList<>();

    public boolean añadirContacto(Contacto contacto1) {
        for (Contacto contacto : contacts) {
            if (contacto.nombre.equals(contacto1.nombre)) {
                contacts.add(contacto1);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarContacto(String nombre) {
        for (Contacto contacto : contacts) {
            if (contacto.nombre.equals(nombre)) {
                contacts.remove(contacto);
                return true;
            }
        }
        return false;
    }

    public boolean existeContacto(String nombre) {
        for (Contacto contacto : contacts) {
            if (contacto.nombre.equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public void listarContactos() {
        for (Contacto contacto : contacts) {
            System.out.println(contacto);
        }
    }

    public int buscaContacto(String nombre) {
        for (Contacto contacto : contacts) {
            if (nombre.equals(contacto.getNombre())) {
                return contacts.indexOf(contacto);
            }
        }
        return -1;
    }

}