public class Ex13_09{
    public static void main(String[] args){
        try{
            test(6,0);
        }
        catch(ArithmeticException e){
            System.out.println(e + " throwed");
        }
    }
    static void test(int num,int den) throws ArithmeticException{
        System.out.println(num +"/" + den + "=" + num / den);
    }
}