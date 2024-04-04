package Iniciante;

import java.util.Scanner;

public class DayOne {
//1-Escreva um programa que imprima "Olá, Mundo!" na tela.
    public static String typing(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextLine();
    }
    public static void main(String[] args) {
        String something = typing("Type something:");

        System.out.println("\n"+something);
    }
}