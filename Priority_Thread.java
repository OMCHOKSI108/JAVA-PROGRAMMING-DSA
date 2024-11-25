public class Priority_Thread extends Thread {

    public void run(){
        System.out.println("Inside the Run method..");
    }

    public static void main(String[] args) {
        Priority_Thread t1 = new Priority_Thread();
        Priority_Thread t2 = new Priority_Thread();
        Priority_Thread t3 = new Priority_Thread();
        Priority_Thread t4 = new Priority_Thread();

        System.out.println("Before Setting Priority....");

        System.out.println("Priotity of T1 : " +t1.getPriority());
        System.out.println("Priotity of T2 : " +t2.getPriority());
        System.out.println("Priotity of T3 : " +t3.getPriority());
        System.out.println("Priotity of T4 : " +t4.getPriority());

        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(7);
        t4.setPriority(10);
        
        System.out.println("After Setting Priority....");
        System.out.println("Priotity of T1 : " +t1.getPriority());
        System.out.println("Priotity of T2 : " +t2.getPriority());
        System.out.println("Priotity of T3 : " +t3.getPriority());
        System.out.println("Priotity of T4 : " +t4.getPriority());
             
        System.out.println("Name Of Current Running Thread : "+ Thread.currentThread().getName());
        
        System.out.println("Priority Of Current Running Thread : "+ Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);

        System.out.println("Main Thread Priority : "+ Thread.currentThread().getPriority());

       t1.start();
       t2.start();
       t3.start();
       t4.start();
       
       
    }
    
}
