

public class Threading05 extends Thread {
      
    public static void main(String[] args) {
        
    
    Thread t = Thread.currentThread();
     System.out.println("Name Of The Current Thread : "+ t.getName());

     t.setName("Sanskruti");

     System.out.println("Name Of The Current Thread : "+ t.getName());

     System.out.println("Priotiy Of Current Thread : "+t.getPriority());

     t.setPriority(MAX_PRIORITY);

     System.out.println("Priotiy Of Current Thread : "+t.getPriority());

     for(int i=0;i<6;i++){

        System.out.println("Thread MAin.... ");
     }



     Thread ct = new Thread(){

        public void run(){
            for (int i=0;i<6;i++){
                System.out.println("Thread Child ......");
            }

        }
     };

     System.out.println("Priority Of child Thread :" + ct.getPriority());
     ct.setPriority(MIN_PRIORITY);
     System.out.println("Priority Of child Thread :" + ct.getPriority());

     ct.start();
     


}

}

class ChilThread extends Thread{


    @Override
    public void run(){
        System.out.println("inside The Child Thread...");

        for(int i=0;i<6;i++){
            System.out.println("child thread....");
        }
    }
}