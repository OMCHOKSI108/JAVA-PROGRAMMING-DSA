abstract class Shape{
    abstract double area();

    void display(){
        System.out.println("This is a Shape ..");
    }
}

class Circle extends Shape{

    double radius;
    
    //Constructor
    Circle(double r){
         radius=r;
    }

    double area(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{

    double len,wid;

    Rectangle(double l, double w){
         len = l;
         wid = w;
    }

    double area(){
        return len*wid;
    }
}
public class exam08 {
    public static void main(String[] args) {
         Shape c = new Circle(5);
         Shape r = new Rectangle(4, 5);

         System.out.println("Area Of Circle : "+c.area());
         System.out.println("Area Of Rectangle " + r.area());

    }
}
