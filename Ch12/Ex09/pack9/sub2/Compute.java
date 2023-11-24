package pack9.sub2;

import pack9.sub1.MyMath;

public class Compute extends MyMath{
    public int ans;

    public void add(int a,int b){
        ans = a + b;
    }

    public void sub(int a,int b){
        ans = a - b;
    }

    public void mul(int a,int b){
        ans =  a * b;
    }

    public void div(int a,int b){
        ans =  a / b;
    }

    public void show(){
        System.out.println("ans="+ans);
    }
}
