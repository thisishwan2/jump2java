package chap8;

public class Num3 {
    static int getDigit(int n){
        int count=0;
        while(true){
            if (n==0){
                break;
            }
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(getDigit(3));
        System.out.println(getDigit(25));
        System.out.println(getDigit(333));

    }
}
/*
static int getDigitCount(int n) {
        String s = "" +n;  // 숫자를 문자열로 바꾼다.
        return s.length();
    }
 */