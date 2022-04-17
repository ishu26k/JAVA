import java.io.*;

import static java.lang.Character.toUpperCase;

public class l11q3 {
    public static void main(String [] args) throws IOException {
        FileReader rd = null;
        FileWriter wr = new FileWriter("f2.txt");
        try{
            rd = new FileReader("f1.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!");
            wr.close();
            return;
        }
        int prev, curr;
        curr = rd.read();
        char ch = toUpperCase((char)curr);
        wr.write((int)ch);
        prev = curr;
        while((curr = rd.read()) != -1){
            if((char)prev == ' ' || (char)prev == '\n'){
                ch = toUpperCase((char)curr);
                wr.write((int)ch);
            }
            else{
                wr.write(curr);
            }
            prev = curr;
        }

        rd.close();
        wr.close();

        rd = new FileReader("f2.txt");
        while((curr = rd.read()) != -1 ){
            System.out.print((char)curr);
        }
        rd.close();
    }
}