public class Ex13_04{
    public static void main(String[] args){
        try{
            int[] arr = {18,29,13,38,15,62};
            int den = 5;
            for(int i=0;i<=10;i++){
                System.out.print(arr[i]+"/"+den+"=");
                arr[i] /= den;
                System.out.println(arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("超過陣列大小");
        }
    }
}