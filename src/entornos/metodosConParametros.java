package entornos;

import java.util.Scanner;

public class metodosConParametros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Numero 1:");
        double n1= sc.nextDouble();
        System.out.println("Numero 2:");
        double n2= sc.nextDouble();
        int operación=menu();
    }
    public static int menu(){
        System.out.println("Selecciona operación: \n1.Suma\n2.Resta\n3.División\n4. Multiplicación");
    }
}
