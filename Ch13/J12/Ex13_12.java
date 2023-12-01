class CenterException extends Exception{}
class OutException extends Exception{}
class InException extends Exception{}

public class Ex13_12{
    public static void main(String[] args){
        double radius = 10.0;
        double x1 = 5.3;
        double y1 = 6.8;
        double x2 = 0.2;
        double y2 = 9.5;
        double dist = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println(dist);
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