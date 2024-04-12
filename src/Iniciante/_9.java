package Iniciante;

import java.util.Scanner;

public class _9 {
    //9-Implemente um programa para calcular o fatorial de um número.

    public static long fatorial(long num){
        long res=1;
        for(long i=num;i>1;i--){
            res=res*i;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the number:");
        long num = sc.nextInt();

        long res = fatorial(num);

        System.out.printf("The factorial of this number %d:\n%d",num,res);
    }
}
