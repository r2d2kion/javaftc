import java.util.Scanner;
public class calc1{
    private static void sysout(String c) {
        System.out.println(c);
    }

    private static int addtion(int a, int b) {
        int c = a + b;
        return c;
    }

    private static int sub(int a, int b) {
        int c = a - b;
        return c;
    }
    public static void main (String [] args){
        sysout("Kamal - Arjun Here");
        sysout("Hello, welcome. vanacum");
        sysout("addition");
        sysout("enter number 1");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        sysout("enter number 2");
        int b =sc.nextInt();
        int c = addtion(a, b);
        sysout("result of a+b = " + c);
        c = sub(a,b);
        sysout("result of a-b = " + c);
        c = a/b;
        sysout("result of a/b " + c);
        c = a*b;
        sysout("result of a*b " + c);

    }




}

