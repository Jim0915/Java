import java.io.*;
import java.util.Random;

public class Ex14_11{
    public static void main(String[] args) throws IOException{
        int c[]=new int[5];
        writeData();
        cnt(c);
    }
    public static void writeData() throws IOException{
        FileOutputStream fo = new FileOutputStream("D:\\Ex14_11\\rand99.txt");
        Random random = new Random();
        for(int i=1;i<100;i++){
            char randomChar = (char) ('a' + random.nextInt(26));
            fo.write(randomChar);
        }
        fo.close();
    }
    public static void cnt(int c[]) throws IOException{
        FileInputStream fi=new FileInputStream("D:\\Ex14_11\\rand99.txt");
        byte d[]=new byte[fi.available()];
        fi.read(d);      
        String str=new String(d);            
        char str2[]=str.toCharArray();          

        for(int i=0;i<str2.length;i++){                
            if(str2[i]=='a')
                c[0]++;
            else if(str2[i]=='e')
                c[1]++;
            else if(str2[i]=='i')
                c[2]++;
            else if(str2[i]=='o')
                c[3]++;
            else if(str2[i]=='u')
                c[4]++;   
        }
        System.out.println("a 出現"+c[0]+"次");
        System.out.println("e 出現"+c[1]+"次");
        System.out.println("i 出現"+c[2]+"次");
        System.out.println("o 出現"+c[3]+"次");
        System.out.println("u 出現"+c[4]+"次");
        fi.close();
    }
}