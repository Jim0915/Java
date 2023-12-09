import java.io.*;
public class Ex14_04{
    public static void main(String[] args) throws IOException{
        char data[] = new char[128];
        FileReader fr = new FileReader("D:\\Ex14_04\\donkey.txt");
        int num = fr.read(data);
        String str = new String(data,0,num);
        System.out.println(str);
        System.out.println(num);
        fr.close();
    }
}
//(b)不一樣，因為還有算/r/n
//我有一隻小毛驢/r/n
//我從來也不騎/r/n
//有一天我心血來潮騎著去趕集
