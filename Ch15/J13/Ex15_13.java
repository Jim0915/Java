class CData extends Thread{
    private static int sum=30;
    private int n;
    private int sec;
    public CData(int a,int s){
        n = a;
        sec = s;
    }
    public void run(){
        while (sum>10) {
            sub(n,sec);
        }
    }
    public synchronized static void sub(int a,int s){
        int tmp = sum - a;
        try{
            sleep(s);
        }catch(InterruptedException ex){}
        if(tmp>0){
            sum = tmp;
            System.out.println("減" + a + "後，餘數為" + sum);
        }
    }
}
public class Ex15_13{
    public static void main(String[] args){
        CData d1 = new CData(5, 1500);
        CData d2 = new CData(9, 1000);
        CData d3 = new CData(8, 2000);
        d1.start();
        d2.start();
        d3.start();
    }
}
/*
(a) 多個執行緒同時操作共享資源 sum 而沒有使用同步機制，需要再sub()前面加上synchronized
(b) 可發現一開始執行時，會等1.5秒才會出現執行緒d1的結果，接著再等1秒會出現執行緒d2的結果，再等2秒才會出現執行緒d3的結果，而不是看哪個執行緒先搶到CPU的資源。
 */