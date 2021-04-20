import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {


        FileInputStream in;
        FileOutputStream out;

        in = new FileInputStream("in.txt");
        out = new FileOutputStream("out.txt");

        int c;
        while((c = in.read()) !=-1) {
            out.write(c);

            ArrayList<String> Lines = new ArrayList<>();
            FileReader fr = new FileReader("in.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                System.out.println("read: " + line);
                Lines.add(line);
            }
            br.close();
            for(String s :Lines){
                System.out.println(s);
            }


            }

        }
    }


