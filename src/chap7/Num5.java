package chap7;

import java.util.Arrays;

public class Num5 {
    public static void main(String[] args) {
        int[] numbers = {1,-2,3,-5,8,-3};
        int[] data = Arrays.stream(numbers)
                .filter((a)->a>=0)
                .toArray()
                ;
        System.out.println(Arrays.toString(data));
    }
}
