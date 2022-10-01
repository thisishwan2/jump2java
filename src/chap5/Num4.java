package chap5;
//오버로딩 문제
import java.util.ArrayList;
import java.util.Arrays;

class Calc {
    int value;

    Calc() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    int avg(int[] data){    //자료형 유의
        int sum=0;
        for(int num:data) {
            sum+=num;
        }
        return sum;
    }
    int avg(ArrayList<Integer> data){
        int sum=0;
        for(int num:data){
            sum+=num;
        }
        return sum;
    }
}

public class Num4 {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int[] data1 = {1,3,5,7,9};
        int result1 = calc.avg(data1);

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        int result2 = calc.avg(data2);

        System.out.println(result1);
        System.out.println(result2);
    }
 }

