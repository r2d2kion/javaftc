import java.util.Scanner;

public class stringutil {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            extracted();
        }

    }

    private static void extracted() {
        System.out.println("\nenter name");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("uppercase of a = " + a.toUpperCase() + "lowercase is " + a.toLowerCase());
        int strlen = a.length();
        for (int i = strlen - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
        System.out.println("\nforward printing");
        for (int i = 0; i < strlen; i++) {
            System.out.print(a.charAt(i));
        }
    }
}
