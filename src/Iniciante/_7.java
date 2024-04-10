package Iniciante;

import java.util.Scanner;

public class _7 {
    //7-Crie um programa para determinar se um ano é bissexto ou não.

    public static boolean bi(int ano){
        if(ano %4 == 0 && ano %100 != 0 || ano %400 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano:");
        int ano = sc.nextInt();

        boolean bissexto = bi(ano);

        if (bissexto==true){
            System.out.printf("%d - Bissexto",ano);
        }else{
            System.out.printf("%d - Não é bissexto",ano);
        }
    }
}
