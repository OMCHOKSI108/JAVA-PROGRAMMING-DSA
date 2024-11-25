

public class MultiThreading_1 extends Thread {
    public  void run(){
           try {
               
                System.out.println("Thread "+Thread.currentThread().getName() +"is Running......");

           } catch (Exception e) {
            System.out.println("Exception is Caught...");
           }
     }
    public static void main(String[] args) {
        
       for(int i=0;i<8;i++){


        MultiThreading_1 t1 = new MultiThreading_1();
        t1.start();
    }
}    
}
