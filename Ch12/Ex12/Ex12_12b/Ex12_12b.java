class Sum{
    private int sum = 0;
    public int add(int n){
        for(int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
    }
}

public class Ex12_12b{
    public static void main(String[] args){
        Sum f = new Sum();
        System.out.println("Sum(5)="+f.add(10));
    }
}