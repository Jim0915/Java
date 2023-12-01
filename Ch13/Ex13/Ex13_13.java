class CenterException extends Exception{}
class OutException extends Exception{}
class InException extends Exception{}

class Circle{
    double radius = 10.0;
    double x1 = 5.3;
    double y1 = 6.8;
    double x2 = 0.2;
    double y2 = 9.5;
    double dist = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    public Circle(double a,double b,double c,double d){
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
    }
    public void check(){
        try{
            if(dist==radius){
                throw new CenterException();
            }
            else if(dist < radius){
                throw new InException();
            }
            else if(dist > radius){
                throw new OutException();
            }
        }
        catch(CenterException ex){
            System.out.print("("+x1+","+y1+")");
            System.out.print("在半徑"+radius);
            System.out.println(", 圓心("+x2+","+y2+")的圓心上");
        }
        catch(InException ex){
            System.out.print("("+x1+","+y1+")");
            System.out.print("在半徑"+radius);
            System.out.println(", 圓心("+x2+","+y2+")的圓內");
        }
        catch(OutException ex){
            System.out.print("("+x1+","+y1+")");
            System.out.print("不在半徑"+radius);
            System.out.println(", 圓心("+x2+","+y2+")的園內");   
        }
    }
}

public class Ex13_13{
    public static void main(String[] args){
        Circle c1 = new Circle(5.8, 2.1, 0.2, 9.5);
        c1.check();
    }
}