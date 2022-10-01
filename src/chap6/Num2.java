package chap6;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        while (true){
            Scanner sc=new Scanner(System.in);
            String line = sc.nextLine();
            if (line.equals("END")){
                break;
            }
            String upper = line.toUpperCase();
            System.out.println(upper);
        }
    }
}

/*
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.IOException;

public class Num2{
    public static void main(String[] args) throws IOException{
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        while (true){
            String a = br.readLine();
            if (a.equals("END")){
                break;
            }
            String upper = a.toUpperCase();
            System.out.println(upper);
        }
    }
}

 */
