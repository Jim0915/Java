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

public class Ex15_02{
    public static void main(String[] args){
        Test hi = new Test("Hello");
        Test bye = new Test("Good bye");
        hi.run();
        bye.run();
    }
}

/* 執行結果
 Hello 1 第18行用hi物件呼叫run()函數執行的結果
 Hello 2 第18行用hi物件呼叫run()函數執行的結果
 Hello 3 第18行用hi物件呼叫run()函數執行的結果
 Hello 4 第18行用hi物件呼叫run()函數執行的結果
 Hello 5 第18行用hi物件呼叫run()函數執行的結果
 Good bye 1 第19行用hi物件呼叫run()函數執行的結果
 Good bye 2 第19行用hi物件呼叫run()函數執行的結果
 Good bye 3 第19行用hi物件呼叫run()函數執行的結果
 Good bye 4 第19行用hi物件呼叫run()函數執行的結果
 Good bye 5 第19行用hi物件呼叫run()函數執行的結果
 */