package Iniciante;

import java.util.Scanner;

public class _8 {
    //8-Escreva um programa para imprimir os primeiros N números primos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=-1;
        System.out.println("Type the quantity:");
        int pri = sc.nextInt();

            for(int j = 2;j<=1000;j++){
                boolean a = true;
                for(int i = 2;i<j;i++){
                    if(j %i == 0){

                            a=false;
                                break;

            }
                }
                if(a==true){
                    cont++;
                    if(cont==pri){
                        break;}
                }

                if (a){
                    System.out.print(j+" ");
                }
                    }

    }
}
