class Test implements Runnable{
    public int n;
    public Test(int n){
        this.n = n;
    }
    public void run(){
        if(n==1){
            for(int i=0;i<5;i++){
                try{
                    System.out.println("Thread 1 is running...");
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){}
            }
        }
        else if(n==2){
            for(int i=0;i<10;i++){
                try{
                    System.out.println("Thread 2 is running...");
                    Thread.sleep(2500);
                }
                catch(InterruptedException e){}
            }
        }
        else if(n==3){
            for(int i=0;i<5;i++){
                try{
                    System.out.println("Thread 3 is running...");
                    Thread.sleep(3500);
                }
                catch(InterruptedException e){}
            }
        }
    }
}
public class Ex15_08{
    public static void main(String[] args){
        Test s1 = new Test(1);
        Test s2 = new Test(2);
        Test s3 = new Test(3);
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);

        t1.start();
        t2.start();
        try{
            t1.join();
            t3.start();
            t3.join();
        }
        catch(InterruptedException ex){}
    }
}