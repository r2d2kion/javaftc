import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        System.out.println("Addition");
        System.out.println("enter number 1");
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("a = "+a);
        int b= sc.nextInt();
        System.out.println("b =  "+b);
        int c = a+b;
        System.out.println("result of a+b = "+c);
        c = a-b;
        System.out.println("result of a-b = "+c);
        c = a*b;
        System.out.println("result of a*b = "+c);
        c = a/b;
        System.out.println("result of a/b = "+c);
    }
}
