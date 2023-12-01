public class Ex13_07{
    public static void main(String[] args){
        try{
            int[] arr = {4,12,87,21,6,18};
            int[] den = {2,0,7,0,61,0};
            double sum = 0.0;
            for(int i=0;i<=6;i++){
                if(den[i] == 0){
                    System.out.println("除數為 0 不計算");
                }
                else{
                    sum += (double)arr[i]/den[i];
                    System.out.println("sum="+sum);
                }
            }
        }
        catch(Exception e){
            System.out.println("捕捉到例外了");
        }
    }
}