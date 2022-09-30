package chap4;

public class Nmu2 {
    public static void main(String[] args) {
        int i =1;
        int sum=0;
        while (i<=1000){
            if (i%3==0){
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
