class NotTriangle extends Exception{}
class EquilateralTriangle extends Exception{}
class NotEquilateralTriangle extends Exception{}

public class Ex13_14{
    public static void triangle(int a,int b,int c) throws NotTriangle,EquilateralTriangle,NotEquilateralTriangle{
        if((a+b)<c || (a+c)<b || (b+c)<a){
            System.out.println("不構成三角形");
        }
        else if(a==b && a==c && b==c){
            System.out.println("這是正三角形");
        }
        else{
            System.out.println("這不是正三角形");
        }
    }
    public static void main(String[] args){
        try{
            triangle(3, 3, 3);
        }
        catch(NotTriangle e){
        }
        catch(EquilateralTriangle e){
        }
        catch(NotEquilateralTriangle e){
        }
    }

}