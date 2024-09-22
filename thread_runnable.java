//By Om choksi Thread implemenetated using runnable class

class Mythread implements Runnable{
   public void run(){
       
         try {
             System.out.println("Thread "+Thread.currentThread().getId() +" is Running ...");
         } catch (Exception e) {

            System.out.println("Exception is Caught...");
         }

   }


}
public class thread_runnable {
    public static void main(String[] args) {
        int n =8;
        for(int i=0;i<n;i++){
            Thread t1 = new Thread(new Mythread());
            t1.start();
        }
    }
    
}
