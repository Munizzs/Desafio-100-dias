package Iniciante;

import java.util.Scanner;

public class _5 {
    //5-Converta uma temperatura de Celsius para Fahrenheit.

    public static double conversor(double cels){
        return 9.0/5 * cels + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o graus Celsius:");
        double cels = sc.nextDouble();

        double far = conversor(cels);

        System.out.printf("Celsius: %.1f --> Fahrenheit: %.1f",cels, far);
    }
}
