package study;

import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("helloworld");
        System.out.println("enter a text");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("enter a number");
        int b = sc.nextInt();
        for (int i=1; i <= b; i++) {
            System.out.println(a);
        }
    }
}

