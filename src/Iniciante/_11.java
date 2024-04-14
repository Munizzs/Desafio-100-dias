package Iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class _11 {
    //11-Implemente um programa para verificar se uma string é um palíndromo.

    public static ArrayList <Character> palíndromo(String word){
        ArrayList <Character> paliList = new ArrayList<>();
        for(int i =0;i<word.length();i++){
            paliList.add(word.charAt(i));
        }
        return paliList;
    }

    public static boolean situacao(String word){
        ArrayList pali = palíndromo(word);
        boolean sit=false;

        for(int i=0;i< pali.size();i++){
            if(pali.get(i).equals(pali.get(word.length()-i-1))){
                sit = true;
            }else{
                sit = false;
            }
        }
        return sit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the word:");
        String word = sc.nextLine();

        boolean sit = situacao(word);

        if (sit==true)
            System.out.printf("%s - palíndromo",word);
        else
            System.out.printf("%s - não é palíndromo",word);
    }
}
