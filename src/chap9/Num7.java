package chap9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class Num7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("output.txt"));
        ArrayList<String> lines = new ArrayList<>();
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            lines.add(line);    //줄마다 lines 배열에 추가
        }
        br.close();

        lines.sort(Comparator.reverseOrder());  //역순

        PrintWriter pr = new PrintWriter("output.txt");
        for (String line : lines) {
            pr.println(line);   //파일 안에 출력하는것.
        }
        pr.close();
    }
}
/*
        for (int i=0; i<lines.size(); i++){
            String data=lines.get(i);
            pr.println(data);
        }
        pr.close();
 */
