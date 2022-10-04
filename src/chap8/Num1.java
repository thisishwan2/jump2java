package chap8;

public class Num1 {
    public static void main(String[] args) {
        int n =1;
        int sum=0;
        while(n<1000){
            if (n%3==0 || n%5==0){
                sum+=n;
                n++;
            }else{
                n++;
            }
        }
        System.out.println(sum);
    }
}
/*
public class Num1 {
    public static void main(String[] args) {
        int result = 0;
        for (int n = 1; n < 1000; n++) {
            if (n % 3 == 0 || n % 5 == 0) {
                result += n;
            }
        }
        System.out.println(result);
    }
}
 */
