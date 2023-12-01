import java.util.*;
class Exception520 extends Exception{}
public class Ex13_16{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入一字串");
            String str = sc.nextLine();
            sc.close();
            if(str.equals("520")){
                throw new Exception520();
            }
            else{
                System.out.println(str);
            }
        }
        catch(Exception520 e){
            System.out.println("這是由字串520所引起的例外");
        }
    }
}