package study;

public class Order {
    boolean fillFlag;
    double cost;
    String shipMethod;

    public void printAll() {
        System.out.println("fillFlag = " + fillFlag + " cost = " + cost + " shipMethod = " + shipMethod);
        if (cost > 100){
            System.out.println("High Priced Item!!!");
        }
    }
    public double calcCost() {
        double tempCost = 0.0;
        return tempCost;

    }

    /*public double calculateShipping() {
        double cost = 0.0;
        // declare conditional statement here
        if (shipping.equals("Regular")) {
            cost = 0.0;
        } else if (shipping.equals("Express")) {
            cost = 1.75;
        } else {
            cost = .50;
        }
        return cost;

    }*/
    public static void main(String[] args) {
        System.out.println("yay");
        Order or1 = new Order();
        or1.shipMethod = "fast";
        or1.cost = 100.1;
        or1.fillFlag = true;
        or1.printAll();


        Order or2 = new Order();
        or2.shipMethod = "express";
        or2.cost = 722.0;
        or2.fillFlag = true;
        or2.printAll();
    }
}