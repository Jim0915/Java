import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14_01{
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.print("Input a String: ");
        str = buf.readLine();
        buf.close();
        System.out.println("string="+str);
    }
}