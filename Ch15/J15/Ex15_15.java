class Prime extends Thread{
    private String id;
    private long start;
    private long end;
    public long count = 0;
    public Prime(String str,long a,long b){
        id = str;
        if(a>=2){
            start = a;
        }
        else{
            start = 2L;
        }
        end = b;
    }
    public synchronized void prime(){
        for(long m=start;m<=end-1;m++){
            for(long n=2L;n<=m;n++){
                if(m%n==0 && n!=m){
                    break;
                }
                else if(n==m){
                    count++;
                }
            }
        }
    }
    public void run(){
        prime();
        System.out.println(id+" 的質數有 " + count + "個");
    }
}
public class Ex15_15{
    public static void main(String[] args){
        Prime prime1 = new Prime("2~100000", 2, 100000);
        Prime prime2 = new Prime("100001~200000", 100001, 200000);
        prime1.start();
        prime2.start();
    }
}
//(a)不一定
//(b)2~100000多