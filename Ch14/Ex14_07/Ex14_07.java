import java.io.*;

public class Ex14_07{
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("D:\\Ex14_07\\hello.txt");
        char hi[] = {'H','e','l','l','o',' ','J','a','v','a','!','\r','\n'};
        String str = "Welcome!";
        fw.write(hi);
        fw.write(str);
        fw.close();
    }
}