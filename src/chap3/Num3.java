package chap3;

public class Num3 {
    public static void main(String[] args) {
        String hong = "881120-1068234";
        String first = hong.substring(0, 6);
        String second = hong.substring(7,14);

        System.out.println(first);
        System.out.println(second);
    }
}
