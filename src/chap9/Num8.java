package chap9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Num8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            String line = br.readLine();
            if(line==null){
                break;
            }
            int number = Integer.parseInt(line);
            list.add(number);

        }
        br.close();

        int total=0;

        PrintWriter pw = new PrintWriter("result.txt");
        for(int num: list){
            total+=num;
        }
        float avg=total/ (float)list.size();    //형변환
        System.out.printf("총합:%d, 평균:%.2f\n", total, avg);  //포맷팅
        pw.println(String.format("%.2f",avg));
        pw.close();
    }
}
