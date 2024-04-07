package Iniciante;

import java.util.Scanner;

public class _4 {
    //4-Crie um programa que determine se um número é positivo, negativo ou zero.

    public static String analisar(int num){

        if(num>0){
           return "positivo";
        }else if(num<0){
            return "negativo";
        }else{
            return "zero";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = sc.nextInt();

        String sit = analisar(num);

        System.out.printf("O numero %d é %s.",num,sit);
    }
}
