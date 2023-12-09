import java.io.*;

public class Ex14_06{
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("D:\\Ex14_06\\hello.txt");
        char hi[] = {'H','e','l','l','o',' ','J','a','v','a','!','\r','\n'};
        fw.write(hi);
        fw.close();
    }
}