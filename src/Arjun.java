import java.util.Scanner;
public class Arjun {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to the opposite namer");
        System.out.println("Please enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        name = name.toUpperCase();
        System.out.println(name);
        StringBuilder res = new StringBuilder();
        res.append(name);
        System.out.print(res.reverse());
    }
}



