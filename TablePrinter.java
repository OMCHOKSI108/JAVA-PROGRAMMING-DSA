class TablePrinter implements  Runnable{
   private int number;

    public TablePrinter(int num){
        this.number = num;
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + " : " + number + " x " + i + " = "+ number*i);
        }
    }
     
    public static void main(String[] args) {
        int n = 6;
        TablePrinter t1 = new TablePrinter(n);
        Thread t01 = new Thread(t1);
        t01.start();
    }

}
 
