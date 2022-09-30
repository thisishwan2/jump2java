package chap4;

public class Num3 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=0; j<i; j++){
                System.out.println("*");    //한줄에 별하나씩 j+1번 찍음
            }
            System.out.println("");         //줄바꿈
        }
    }
}
