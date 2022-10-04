package chap9;

import java.util.ArrayList;
import java.util.Arrays;

public class Num3 {
    public static void main(String[] args) {
        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int sum=0;
        for(int a: A){
            if (a>=50)
                sum+=a;
            }
        System.out.println(sum);
    }
}


//ArrayList<Integer> list = new ArrayList<>(Arrays.asList(A));
//위는 오류 발생 왜냐면 원시 자료형과 wrapper자료형이라

