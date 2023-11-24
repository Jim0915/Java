package pack12_10;

import pack12_10.sub1.Sphere;
import pack12_10.sub2.Trapezoid;

public class Ex12_10 {
    public static void main(String[] args){
        Sphere sp = new Sphere(2);
        Trapezoid tra = new Trapezoid(2, 3, 4);
        sp.show();
        tra.show();
    }
}
