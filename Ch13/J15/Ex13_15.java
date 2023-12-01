class IllegalArgumentException extends Exception{}
class NotOddException extends Exception{}

public class Ex13_15{
    public static void odd(int n) throws IllegalArgumentException,NotOddException{
        if(n<=0){
            throw new IllegalArgumentException();
        }
        else if(n%2==0){
            throw new NotOddException();
        }
        for(int i=1;i<=n;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int n =11;
        try{
            odd(n);
        }
        catch(IllegalArgumentException e){
            System.out.printf("%d值小於等於0,無法處理",n);
        }
        catch(NotOddException e){
            System.out.printf("%d值為偶數,無法處理",n);
        }
    }

}