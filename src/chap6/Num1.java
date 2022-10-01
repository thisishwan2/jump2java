package chap6;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Num1 {
    public static void main(String[] args) throws IOException{
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        String a = br.readLine();
        String[] num = a.split(" ",2);
        int n1=Integer.parseInt(num[0]);
        int n2=Integer.parseInt(num[1]);
        int sum=n1+n2;
        System.out.println(sum);
    }
}

/*
import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째");
        int first = sc.nextInt();
        System.out.println("두번째");
        int sec = sc.nextInt();

        int result = first+sec;
        System.out.println(result);
    }
 */