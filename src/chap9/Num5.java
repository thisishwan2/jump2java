package chap9;

import java.io.InputStream;
import java.util.Scanner;

public class Num5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을 출력할 숫자를 입력하세요(2~9): ");
        int num =sc.nextInt();
        String result = "";
        for(int i =1; i<=9; i++){
            String a =Integer.toString(i*num);
            result+=a+" ";
        }

        System.out.println(result);
    }
}
//System.out.printf("%d ", i * num); printf 이용해서 문자열을 나열