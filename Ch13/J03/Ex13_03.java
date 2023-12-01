public class Ex13_03{
    public static void main(String[] args){
        int num = 12, den = 0;
        try{
            int ans = num / den;
            if(den == 0 ){
                throw new ArithmeticException();
            }
            else{
                System.out.println(ans);
            }
        }
        catch(ArithmeticException e){
            System.out.println("除數為0");
        }
        finally{
            System.out.println("end of main()!!");
        }
    }
}