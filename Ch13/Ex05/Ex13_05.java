public class Ex13_05{
    public static void main(String[] args){
        try{
            int num = 5;
            int[] d = {3,0,0,1};
            for(int i=0;i<d.length;i++){
                if(d[i] == 0){
                    System.out.println("除數為 0 不計算");
                }
                else{
                    System.out.println(num+"/"+d[i]+"= "+num/d[i]);
                }
            }
        }
        catch(ArithmeticException e){
            System.out.println("除數為 0 不計算");
        }
    }
}