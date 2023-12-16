class Add implements Runnable{
    private int n;
    private int sum=0;
    public Add(int a){
        n = a;
    }
    public void run(){
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.printf("1加到%d=%d\n",n,sum);
    }
}
public class Ex15_04{
    public static void main(String[] args){
        Add num1 = new Add(5);
        Add num2 = new Add(10);
        Thread t1 = new Thread(num1);
        Thread t2 = new Thread(num2);
        t1.start();
        try{
            t1.join();
            t2.start();
            t2.join();
        }
        catch(InterruptedException e){}
        

    }
}