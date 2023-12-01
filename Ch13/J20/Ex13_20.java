import java.util.*;
import java.io.*;
class IllegalArgument extends Exception{}
class NotEven extends Exception{}

public class Ex13_20{
    public static void even(int n)throws IllegalArgument,NotEven{
        if(n<0){
            throw new IllegalArgument();
        }
        if(n%2!=0){
            throw new NotEven();
        }
        for(int i=0;i<=n;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException{
        int n = 0;
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入一個數值:");
            n = sc.nextInt();
            sc.close();
            even(n);
        }
        catch(IllegalArgument e){
            System.out.printf("%d值小於0,無法處理",n);
        }
        catch(NotEven e){
            System.out.printf("%d值為奇數,無法處理",n);
        }
    }
}