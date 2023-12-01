class Test{
    public void aaa(int a,int b) throws ArithmeticException{
        int c=a/b;
        System.out.println(a+"/"+b+"="+c);
    }
}

public class Ex13_11{
    public static void main(String[] args){
        try{
            Test a1 = new Test();
            a1.aaa(4, 0);
        }
        catch(ArithmeticException e){
            System.out.println(e+" throwed");
        }
    }
}