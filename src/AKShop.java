import java.util.Scanner;
public class AKShop {
    public static void main(String[] args){
        System.out.println ("Welcome, to my shop");
        //declaring constant value for quarter
        final double QUARTER_VALUE = 0.25;
        double total = 0;
        int numitems = 0;
        int noOfQuarter = 0;
        double change = 0;
        //Customer purchase milk of price 11.99
        total = total + 11.99;
        numitems = numitems + 1;
        //Customer purchase egg of price 9.99
        total += 9.99;
        numitems += 1;
        System.out.println ("total is = $"+total);
        System.out.println ("numitems is ="+numitems);
        total *= 1.06;
        System.out.println ("total with nj tax is = $"+total);
        change = 30 - total;
        System.out.println (change);
        noOfQuarter =  (int) (change/QUARTER_VALUE);

        System.out.println (noOfQuarter);
        change = change - (noOfQuarter*QUARTER_VALUE);
        System.out.println (change);







    }


}
