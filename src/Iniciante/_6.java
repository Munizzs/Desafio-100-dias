package Iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class _6 {
    //6-Implemente um programa para calcular a média de números determinados pelo usuario.
    static ArrayList <Integer> num = new ArrayList<>();

    public static int media(){
        int soma=0;
        for (int i =0;i< num.size();i++){
            soma += num.get(i);
        }
        return soma/ num.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros:");
        int n = sc.nextInt();

        System.out.println();

        for(int i =0;i<n;i++){
            System.out.printf("Digite o %dº numero: ",i+1);
            num.add(sc.nextInt());
        }

        System.out.printf("\nMedia: %d",media());
    }
}
