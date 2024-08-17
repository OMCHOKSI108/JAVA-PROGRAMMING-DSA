 // Interface
interface Animal {
    // Abstract method
    void sound();

    // Another abstract method
    void eat();
}

interface human{
    void voice();

    void height();
}

class realhuman implements human{
    
    @Override
    public void voice(){
        System.out.println("Yes sir .");
    }
    
    @Override
    public void height(){
        System.out.println(" I am tall ");
    }

}
//om choksi 17/08/2004
// Class implementing the Animal interface
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }

    @Override
    public void eat() {
        System.out.println("The cat eats.");
    }
}

public class Maininterface {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound(); // Calls the implemented method in Cat
        cat.eat();   // Calls the implemented method in Cat

        realhuman h1 = new realhuman();
        h1.voice();
        h1.height();

    }
}
