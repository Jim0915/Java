class Animal implements Runnable{
    private String id;
    public Animal(String str){
        id = str;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.printf("%s來了%d次\n",id,i);
        }
    }
}

public class Ex15_11{
    public static void main(String[] args){
        Thread Tom = new Thread(new Animal("狸克"));
        Thread Redd = new Thread(new Animal("狐利"));
        Thread Tortimer = new Thread(new Animal("壽伯"));
        Thread Blathers = new Thread(new Animal("傅達"));
        try{
            Tom.start();
            Tom.join();
            Tortimer.start();
            Tortimer.join();
            Blathers.start();
            Blathers.join();
            Redd.start();
            Redd.join();
        }catch(InterruptedException ex){}
        System.out.println("All Threads are finished");
    }
}