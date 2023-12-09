import java.io.*;

class Data {
    private String name;
    private int english;
    private int math;

    public Data(String str, int e, int m) {
        name = str;
        english = e;
        math = m;
        try{
            writeData();
        }
        catch(IOException ex){
        }
    }

    public void writeData() throws IOException {
        BufferedWriter write = new BufferedWriter(new FileWriter("D:\\Ex14_10\\student.txt",true));
        write.write("姓名:" + name);
        write.newLine();
        write.write("英文成績:" + english);
        write.newLine();
        write.write("數學成績:" + math);
        write.newLine();
        write.write("平均:" + (double) (english + math) / 2.0);
        write.newLine();
        write.newLine();
        write.close();
    }

    public void show() {
        System.out.println("姓名: " + name);
        System.out.println("英文成績: " + english);
        System.out.println("數學成績: " + math);
        System.out.println("平均: " + (double) (english + math) / 2.0);
    }
}

public class Ex14_10 {
    public static void main(String[] args) {
        Data stu1 = new Data("Ariel", 92, 85);
        Data stu2 = new Data("Fiona", 67, 89);
        stu1.show();
        System.out.println();
        stu2.show();
    }

    public static void readData() throws IOException {
        BufferedReader buf = new BufferedReader(new FileReader("D:\\Ex14_10\\student.txt"));
        buf.close();
    }
}