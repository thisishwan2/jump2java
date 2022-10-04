package chap9;
import java.util.Scanner;
public class Num6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String[] num = word.split(","); //,구분자로 배열에 저장

        int tot=0;

        for (String number:num) {
            tot+=Integer.parseInt(number);
        }
        System.out.println(tot);

    }
}
