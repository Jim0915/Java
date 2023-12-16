class Sub implements Runnable{
    private int n;
    private int sum=1;
    public Sub(int a){
        n = a;
    }
    public void run(){
        for(int i=1;i<=n;i++){
            sum *= i;
        }
        System.out.printf("1乘到%d=%d\n",n,sum);
    }
}

public class Ex15_06{
    public static void main(String[] args){
        Sub s1 = new Sub(5);
        Sub s2 = new Sub(10);
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        t1.start();
        try{
            t1.join();
            t2.start();
            t2.join();
        }
        catch(InterruptedException e){}
    }
}