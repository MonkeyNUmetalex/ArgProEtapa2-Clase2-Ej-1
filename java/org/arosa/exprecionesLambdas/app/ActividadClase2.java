package org.arosa.exprecionesLambdas.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ActividadClase2 {
    public static void main(String[] args) {
        List<String> palabrasList = new ArrayList<>();
        palabrasList.add("hola");
        palabrasList.add("Carlos");
        palabrasList.add("metodo");
        palabrasList.add("encapsulamiento");
        palabrasList.add("Romina");
        palabrasList.add("categoria");
        palabrasList.add("Colosal");

        convertir lista = (palabras) -> {

            List<String> palabrasMayucula = new ArrayList<>();
            for(String p : palabras){
                palabrasMayucula.add(p.toUpperCase());
            }
            return palabrasMayucula;
        };

       lista.mayuscula(palabrasList).forEach(System.out :: println);

    }

    @FunctionalInterface
    public interface convertir {
        List<String> mayuscula(List<String> p);

    }
}
