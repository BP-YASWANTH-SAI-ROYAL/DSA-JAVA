
/*

// Define a class named Chaishop
class Chaishop {
    String branchname;     // Variable to store the branch name of the tea shop
    int pricepercup;       // Variable to store the price per cup of tea
}

// Main class to run the program
class Main {
    public static void main(String[] args) {

        // Create first object of Chaishop
        Chaishop branch1 = new Chaishop();         // Instantiate branch1
        branch1.branchname = "Royal Tea";          // Assign branch name
        branch1.pricepercup = 5;                   // Assign price per cup

        // Create second object of Chaishop
        Chaishop branch2 = new Chaishop();         // Instantiate branch2
        branch2.branchname = "ROYAL KING";         // Assign branch name
        branch2.pricepercup = 100;                 // Assign price per cup

        // Display the details of branch1
        System.out.println("Branch Name: " + branch1.branchname + ", Price per Cup: " + branch1.pricepercup);

        // Display the details of branch2
        System.out.println("Branch Name: " + branch2.branchname + ", Price per Cup: " + branch2.pricepercup);
    }
}



*/


/*


class Chaishop {
    String branchname;     // store name of the tea shop branch
    int pricepercup;       // store price for one cup of tea

    public void Classfun() {    // method inside Chaishop class
        System.out.println("I AM FUNCTION IN THE CLASS LOOPALA BROO SEE YAA HERE.");  // prints this message
    }
}

class Main {

    public static void fun() {   // static method inside Main class
        System.out.println("I AM FUNCTION IN THE MAIN CLASS BROO SEE YAA HERE.");  // prints this message
    }

    public static void main(String[] args) {   // main method - program starts here

        fun();   // call the static method fun() from Main class and print message

        Chaishop branch1 = new Chaishop();     // create first Chaishop object branch1
        branch1.branchname = "Royal Tea";      // set branch name to "Royal Tea"
        branch1.pricepercup = 5;               // set price per cup to 5

        Chaishop branch2 = new Chaishop();     // create second Chaishop object branch2
        branch2.branchname = "ROYAL KING";     // set branch name to "ROYAL KING"
        branch2.pricepercup = 100;             // set price per cup to 100

        // print details of branch1
        System.out.println("Branch Name: " + branch1.branchname + ", Price per Cup: " + branch1.pricepercup);

        // print details of branch2
        System.out.println("Branch Name: " + branch2.branchname + ", Price per Cup: " + branch2.pricepercup);

        branch1.Classfun();   // call Classfun() method of branch1 and print its message
    }
}

*/




// Define the Chaishop class
class Chaishop {
    String branchname;
    int pricepercup;

    // Constructor to initialize branch name and price per cup
    public Chaishop(String bn, int ppc) {
        branchname = bn;          // set the branch name
        pricepercup = ppc;        // set the price per cup
        System.out.println("Constructor called for branch: " + branchname);  // print message
    }

    // Method that takes a string and prints a message
    public void Classfun(String s) {
        System.out.println("Message from branch: " + s);  // print the string passed
    }
}

// Main class
class Main {

    // Static method in Main class
    public static void fun() {
        System.out.println("I AM FUNCTION IN THE MAIN CLASS BROO SEE YAA HERE.");
    }

    // Main method - program starts here
    public static void main(String[] args) {

        fun();  // call Main class method

        // Create branch1 with parameters
        Chaishop branch1 = new Chaishop("Royal Tea", 5);

        // Create branch2 with parameters
        Chaishop branch2 = new Chaishop("ROYAL KING", 100);

        // Print details of each branch
        System.out.println("Branch Name: " + branch1.branchname + ", Price per Cup: " + branch1.pricepercup);
        System.out.println("Branch Name: " + branch2.branchname + ", Price per Cup: " + branch2.pricepercup);

        // Call method on branch1
        branch1.Classfun("Hello from Royal Tea!");
    }
}
