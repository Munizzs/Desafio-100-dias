package Iniciante;

import java.util.Random;
import java.util.Scanner;

public class _13 {
    //13- Escreva um programa que ordene um array de inteiros.

    public static int[] order(int n){
        Random rand = new Random();
        int num[]=new int[n];
        for(int i=0;i<num.length;i++){
            num[i]= rand.nextInt(1,11);
        }

        int ord[]=new int[num.length];

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num.length - 1; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros:");
        int n = sc.nextInt();

        int ord[] = order(n);

        for(int show: ord){
            System.out.printf("%d, ",show);
        }
    }
}
