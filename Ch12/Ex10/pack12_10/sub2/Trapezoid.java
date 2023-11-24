package pack12_10.sub2;

public class Trapezoid {
    public int upper;
    public int base;
    public int height;
    public Trapezoid(int u,int b,int h){
        upper = u;
        base = b;
        height = h;
    }
    public void show(){
        System.out.print("upper="+upper);
        System.out.print(", base="+base);
        System.out.print(", height="+height);
        System.out.print(", area="+(upper+base)*height/2.0);
    }
}
