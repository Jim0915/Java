class Test implements Runnable{
    public int n;
    public Test(int n){
        this.n = n;
    }
    public void run(){
        for(int i=0;i<10;i++){
            try{
                if(n==1){
                    System.out.println("Thread 1 is running...");
                    Thread.sleep(1000);
                }
                else if(n==2){
                    System.out.println("Thread 2 is running...");
                    Thread.sleep(2500);
                }
            }
            catch(InterruptedException e){}
        }
    }
}
public class Ex15_07{
    public static void main(String[] args){
        Test s1 = new Test(1);
        Test s2 = new Test(2);
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        
        t1.start();
        t2.start();
    }
}