package study;

import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("please enter a text");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("entered text is " + a);
        System.out.println("please enter a number");
        int b = sc.nextInt();
        System.out.println("entered number is " + b);
        System.out.println("please enter a boolean - true or false");
        boolean c = sc.nextBoolean();
        System.out.println("entered boolean is " + c);
    }
}
