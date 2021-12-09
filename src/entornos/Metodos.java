package entornos;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        elejir();
    }
    public static void ejercicio10(){
        int num=95;
        int decenas= num/10;
        System.out.println("Decenas: "+decenas);
    }

    public static void ejercicio11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Número a invertir: ");
        int número = sc.nextInt();

        // separo decenas y unidades
        int decenas = número / 10;
        int unidades = número % 10;

        // ahora lo que antes "pesaba" como unidad ahora tiene que "pesar" como decena
        int invertido = unidades * 10 + decenas;
        System.out.println("Número invertido:" + invertido);
    }
    public static void elejir(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Que metodo quieres:");
        int ej = sc.nextInt();
        if (ej==10) {
            ejercicio10();
        } else if (ej==11) {
            ejercicio11(); //paara enlazar
        }
    }
}
