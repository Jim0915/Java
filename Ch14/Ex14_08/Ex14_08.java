import java.io.*;

public class Ex14_08{
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new FileReader("D:\\Ex14_08\\proverb.txt"));
        String line;
        String StringSkip = "You can't be perfect but you can be unique.";
        while((line = buf.readLine()) != null){
            if(line.contains(StringSkip)){
                continue;
            }
            System.out.println(line);
        }
        buf.close();
    }
}