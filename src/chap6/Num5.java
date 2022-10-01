package chap6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Num5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        ArrayList<String> list =new ArrayList<>();
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            list.add(line);
        }
        br.close();

        String txt= String.join("\n",list);
        txt=txt.replaceAll("python","java");

        FileWriter fw = new FileWriter("sample.txt");
        fw.write(txt);
        fw.close();
     }
}

