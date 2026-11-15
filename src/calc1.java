import java.util.Scanner;
public class calc1{
    public static void main (String [] args){
        System.out.println ("Hello, welcome. vanacum");
        System.out.println ("addition");
        System.out.println ("enter number 1");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println ("enter number 2");
        int b =sc.nextInt();
       int c = a+b;
        System.out.println("result of a+b = "+c);
         c = a-b;
        System.out.println("result of a-b = "+c);
         c = a/b;
        System.out.println("result of a/b "+c);
         c = a*b;
        System.out.println("result of a*b "+c);

    }
}

