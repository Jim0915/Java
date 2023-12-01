public class Ex13_06{
    public static void main(String[] args){
        try{
            int num =12;
            int[] den = {12,0,3,0,0,4};
            for(int i=0;i<10;i++){
                try{
                    System.out.println(num+"/"+den[i]+"="+num/den[i]);
                }
                catch(ArithmeticException e){
                    System.out.println("除數為0");
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("陣列索引值超出了範圍");
        }
    }
}