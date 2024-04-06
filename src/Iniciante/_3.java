package Iniciante;

import java.util.Scanner;

public class _3 {
    //3-Crie um programa que verifique se um número é par ou ímpar.

    public static Boolean verificar(int num){
        if(num %2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = sc.nextInt();

        String sit;

        if (verificar(num) == true){
            sit = "Par";
        }else{
            sit = "Impar";
        }

        System.out.printf("\nO numero %d é %s.",num,sit);
    }
}
