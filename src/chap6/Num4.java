package chap6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample1.txt", true);
        Scanner sc= new Scanner(System.in);
        String line = sc.nextLine();
        fw.write(line+"\n");
        fw.close();
    }
}
//printwriter 사용도 가능!
