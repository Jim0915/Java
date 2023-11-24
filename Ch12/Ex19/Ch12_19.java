class f{
    public double sum;
    public f(int n){
        for (int i=1;i<=n;i++){
            sum += Math.sqrt(i);
        }
    }
    public void show(){
        System.out.println(sum);
    }
}

public class Ch12_19{
    public static void main(String[] args){
        f f1 = new f(5);
        f1.show();
    }
}
