package chap7;

import java.util.ArrayList;
import java.util.Arrays;

public class Num2 {
    public static void main(String[] args) {
        int result = 0;
        try {
            int[] a = {1, 2, 3};
            int b = a[3]; //ArrayIndexOutOfBoundsException
            ArrayList c = new ArrayList(Arrays.asList("3"));
            int d = (int) c.get(0);//ClassCastException 문자열을 정수로 바꾸려햇으므로
            int e = 4 / 0;//ArithmeticException
        } catch (ClassCastException e) {
            result += 1;
        } catch (ArithmeticException e) {
            result += 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            result += 3;
        } finally {
            result += 4;
        }
        System.out.println(result); // result 의 값은 무엇일까? 7
        //왜냐하면 int b = a[3]; 에서 a의 3번째 인덱스는 존재하지 않으므로 ArrayIndexOutOfBoundsException이 발생
        //또한 finally는 꼭수행되어야 하는 문장이므로 result= 3+4 이다.
    }
}