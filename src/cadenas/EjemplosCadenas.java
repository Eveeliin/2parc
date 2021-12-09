package cadenas;

import java.util.Locale;

public class EjemplosCadenas {
    public static void main(String[] args) {
        String cadena= "Hola 5";
        System.out.println(cadena);
        int longitud= cadena.length();// a diferencia de los array tienen parentesis
        System.out.println(longitud);
        System.out.println(cadena.charAt(2));// imprimir el 3to y ultimo caracter
        System.out.println(" ========= ");
        System.out.println(cadena.charAt(cadena.length()-1));
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.contains("a 5"));
        System.out.println(cadena.length());
        cadena = cadena.trim();
        System.out.println(cadena.length());// como son los espacios de el centro no los quita, solo los que hay en el centro.
    }
}
