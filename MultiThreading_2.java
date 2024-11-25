public class MultiThreading_2 implements Runnable{

    public void run(){
        try {
            System.out.println("Thread " +Thread.currentThread().getName()+" is Running ...");
        } catch (Exception e) {
            System.out.println("Exception is Caught...."+ e.getMessage());
        }

    }

    public static void main(String[] args) {
        int n=30;
        for(int i=0;i<n;i++){
            Thread t1 = new Thread(new MultiThreading_2());
            t1.start();
        }
    }
    
}


//extends thread -> create class name and its Object 
//Runnable interface -> create Thread class object and pass class name 

/*If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple
 inheritance. But, if we implement the Runnable interface, our class can still extend other base classes. */