import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14_03{
    public static void main(String[] args) throws IOException{
        try{
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("請輸入一個整數:");
            int n  = Integer.parseInt(buf.readLine());
            int sum=0;
            for(int i=1;i<=n;i++){
                sum += i;
            }
            System.out.println(sum);
        }
        catch(Exception e){}

    }
}