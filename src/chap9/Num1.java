package chap9;

public class Num1 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String str=String.join("#",a.split(":"));
        System.out.println(str);
    }
}
