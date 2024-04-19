package Iniciante;

import java.util.Scanner;

public class _14 {
    //14 - Implemente um programa para verificar se um número é primo.
    public static boolean primo(int num){
        boolean a = true;
        if(num <= 1)
            a = false;
        else {
            for(int i = 2; i <= num/2; i++) {
                if(num % i == 0) {
                    a = false;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the number:");
        int num = sc.nextInt();

        boolean s = primo(num);

        if (s)
            System.out.printf("%d - primo",num);
        else
            System.out.printf("%d - não é primo",num);
    }
}
