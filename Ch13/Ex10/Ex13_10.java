class Test{
    public static void test(int num,int den) throws ArithmeticException{
        System.out.println(num +"/" + den + "=" + num / den);
    }
}

public class Ex13_10{
    public static void main(String[] args){
        try{
            Test.test(6,0);
        }
        catch(ArithmeticException e){
            System.out.println(e + " throwed");
        }
    }

}