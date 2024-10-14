// Java Program to demonstrate
// Instance Variables

class exam06 {

    // Declared Instance Variable
    public String geek;
    public int i;
    public Integer I;
    public exam06()
    {
        // Default Constructor
        // initializing Instance Variable
        this.geek = "Om Choksi..";
    }

    // Main Method
    public static void main(String[] args)
    {
        // Object Creation
        exam06 name = new exam06();

        // Displaying O/P
        System.out.println("Geek name is: " + name.geek);
        System.out.println("Default value for int is " + name.i);
      
        // toString() called internally
        System.out.println("Default value for Integer is " + name.I);
    }
}

