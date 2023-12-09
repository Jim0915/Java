import java.io.*;

public class Ex14_09{
    public static void main(String[] args) throws IOException{
        BufferedReader buf1 = new BufferedReader(new FileReader("D:\\Ex14_09\\aaa.txt"));
        BufferedReader buf2 = new BufferedReader(new FileReader("D:\\Ex14_09\\bbb.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Ex14_09\\ccc.txt"));
        String line;
        while ((line = buf1.readLine()) != null){
            writer.write(line);
            writer.newLine();
        }
        while ((line = buf2.readLine()) != null){
            writer.write(line);
            writer.newLine();
        }
        buf1.close();
        buf2.close();
        writer.close();
        BufferedReader buf3 = new BufferedReader(new FileReader("D:\\Ex14_09\\aaa.txt"));
        BufferedReader buf4 = new BufferedReader(new FileReader("D:\\Ex14_09\\bbb.txt"));
        BufferedReader buf5 = new BufferedReader(new FileReader("D:\\Ex14_09\\ccc.txt"));
        System.out.println("aaa.txt");
        while((line = buf3.readLine()) != null){
            System.out.println(line);
        }
        System.out.println("\nbbb.txt");
        while((line = buf4.readLine()) != null){
            System.out.println(line);
        }
        System.out.println("\nccc.txt");
        while((line = buf5.readLine()) != null){
            System.out.println(line);
        }
        buf3.close();
        buf4.close();
        buf5.close();
    }
}