package Iniciante;

import java.util.Scanner;

public class DayOne {

    public static String typing(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextLine();
    }
    public static void main(String[] args) {
        String something = typing("Type something:");

        System.out.println("\n"+something);
    }
}