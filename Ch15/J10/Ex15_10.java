class Hi implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello " + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){}
        }
    }
}
class Bye implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Good bye " + i);
            try{
                Thread.sleep(2500);
            }catch(InterruptedException ex){}
        }
    }
}

public class Ex15_10{
    public static void main(String[] args){
        Thread hi = new Thread(new Hi());
        Thread bye = new Thread(new Bye());
        
        hi.start();
        bye.start();
    }
}