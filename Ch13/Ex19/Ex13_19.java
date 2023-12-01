import java.io.IOException;
import java.util.*;

class ArgumentOutOfBound extends Exception{}
public class Ex13_19{
    public static boolean prime(int n) throws ArgumentOutOfBound{
        boolean r = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                r = false;
                break;
            }
        }
        return r;
    }
    public static void main(String[] args) throws IOException{
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Input a number:");
            int n = sc.nextInt();
            sc.close();
            boolean r = prime(n);
            if(n <= 1){
                throw new ArgumentOutOfBound();
            }
            if(r==true){
                System.out.println(n+" is a prime");
            }
		    else{
                System.out.println(n+" is not a prime");
            }
        }
        catch(ArgumentOutOfBound e){
            System.out.println("輸入錯誤,請輸入大於1的數字。");
        }
    }
}