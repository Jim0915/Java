package pack12_10.sub1;

public class Sphere {
    public double radius;
    public Sphere(double r){
        radius = r;
    }
    public void show(){
        System.out.println("radius="+radius+", volume="+ String.format("%.2f",(double)4/3 * 3.14 * Math.pow(radius, 3)));
    }
}
