package Iniciante;

import java.util.Scanner;

public class DayTwo {
//2-Calcule a soma da quantidade de números inteiros requerido pelo usuario.

    static Scanner sc = new Scanner(System.in);

    public static int soma(int qtdNum){
        int soma = 0;
        for (int i = 0;i<qtdNum;i++){
            System.out.printf("Digite o %dº numero: ",i+1);
            int num= sc.nextInt();

            soma += num;
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.println("Digite a quantidade de numeros:");
        int qtdNum = sc.nextInt();

        int res = soma(qtdNum);

        System.out.printf("\nSoma = %d",res);
    }
}
