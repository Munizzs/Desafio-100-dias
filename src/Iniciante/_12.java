package Iniciante;

import java.util.Scanner;

public class _12 {
    //12-Crie um programa para calcular a área de um círculo.

    public static double area(int r){
        return Math.PI*Math.pow(r,2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio:");
        int r = sc.nextInt();

        double a = area(r);

        System.out.printf("Area do circulo: %.2f",a);
    }
}
