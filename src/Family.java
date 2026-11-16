import java.util.ArrayList;
import java.util.List;

public class Family {
    String father;
    String mother;
    List<String> children = new ArrayList<>();

    // 1. Helper Method to set up a family without a constructor
        public static Family createFamily(String fatherName, String motherName, String... childNames) {
        Family fam = new Family();
        fam.father = fatherName;
        fam.mother = motherName;

        for (String child : childNames) {
            fam.children.add(child);
        }
        return fam;
    }

    // 2. Method to print details so you don't repeat print statements
    public void printFamilyDetails() {
        System.out.println("Father is " + father);
        System.out.println("Mother is " + mother);
        System.out.println("Number of children: " + children.size());

        for (String child : children) {
            System.out.println("Child: " + child);
        }
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to our Families\n");

        // 3. A list to hold all 10 (or more) families
        List<Family> allFamilies = new ArrayList<>();

        // Create and add families cleanly using our helper method
        allFamilies.add(createFamily("Test1", "Test2", "Child1", "Child2")); // 2 children
        allFamilies.add(createFamily("Test3", "Test4", "Child3"));           // 1 child
        allFamilies.add(createFamily("Test5", "Test6"));                     // 0 children

        // 4. One loop prints every family in the list
        for (Family fam : allFamilies) {
            fam.printFamilyDetails();
        }
    }
}
