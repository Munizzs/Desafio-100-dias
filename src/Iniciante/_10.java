package Iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class _10 {
    //10-Crie um programa para inverter uma string.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type a word:");
        String word = sc.nextLine();

        ArrayList <Character> inv = new ArrayList<>();
        for(int i =0;i<word.length();i++){
            inv.add(word.charAt(i));
        }

        for(int i =inv.size()-1;i>=0;i--){
                System.out.print(inv.get(i));
        }

}}
