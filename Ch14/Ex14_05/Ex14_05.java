import java.io.*;
public class Ex14_05{
    public static void main(String[] args) throws IOException{
        String str = "D:\\Ex14_05\\donkey.txt";
        String line;
        try{
            BufferedReader br = new BufferedReader(new FileReader(str));
            br.readLine(); //讀取第一行
            //從第二行開始讀取
            while((line = br.readLine()) != null){
                System.out.println(line);
            } 
            br.close();
        }
        catch(Exception e){}
    }
}
