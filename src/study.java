import java.sql.SQLOutput;
import java.util.Scanner;

public class study {
    public static void main(String[] args) {
        System.out.println("enter how fast Krishna's car goes");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter how fast Arjun's car goes");
        int b = sc.nextInt();
        if (a > b) {
            int c = a-b;
            System.out.println("Krishna's car is faster then Arjun's car");
            System.out.println("Krishna car is faster than Arjun's car by "+c + "MPH");
            c = a-b;
        } else {
            int c = a-b;
            System.out.println("Arjun's car is faster then Krishna's car");
            System.out.println("Arjun car is faster than Krishna's car by "+c + " MPH");
            c = b-a;

        }

        }
    }
