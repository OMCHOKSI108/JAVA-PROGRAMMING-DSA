interface animal{

    public void sound();
    public void sleep();
}

class dog implements animal{
    public void sound(){
        System.out.println("Heyy");

    }
    public void sleep(){
        System.out.println("heyy Good night");
    }
}

public class exam09{
public static void main(String[] args) {
 
    dog obj1 = new dog();
   obj1.sound();
   obj1.sleep();
   
}
}