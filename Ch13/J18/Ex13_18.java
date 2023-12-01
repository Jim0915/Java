import java.io.*;

class ArgumentOutOfBound extends Exception {}

public class Ex13_18 {
    public static void mySqrt(int n) throws ArgumentOutOfBound {
        if (n < 0) {
            throw new ArgumentOutOfBound();
        }
        double result = Math.sqrt(n);
        System.out.println("開根號值: " + (int)result);
    }

    public static void main(String[] args) throws IOException {
        int n=0;
        String s1;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("請輸入一個數值: ");
            s1 = buf.readLine();
            n = Integer.parseInt(s1);
            mySqrt(n);
        } catch (ArgumentOutOfBound e) {
            System.out.printf("%d小於0", n);
        }
    }
}