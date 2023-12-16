class Test extends Thread{
    public String id;
    public Test(String str){
        id = str;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            for(int j=0;j<100000000;j++);
            System.out.println(id+" "+i);
        }
    }
}

public class Ex15_03{
    public static void main(String[] args){
        Test hi = new Test("Hello");
        Test bye = new Test("Good bye");
        Test moring = new Test("Good moring");
        Test night = new Test("Good night");

        night.start();
        moring.start();
        hi.start();
        bye.start();
    }
}
