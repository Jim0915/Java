import java.util.*;

public class Ex14_02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入字串:");
        String s1 = sc.nextLine();
        sc.close();
        System.out.println(s1.toUpperCase());
    }
}