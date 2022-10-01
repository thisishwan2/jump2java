package chap5;

import java.util.ArrayList;
import java.util.Arrays;

public class Num5 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());
    }
}

// a와 b에는 같은 주소가 할당됨. 즉 같은 객체임. 따라서 독립적인 객체를 생성ㅎㅏ고싶으면
/*
public class Num5 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = new ArrayList<>(a);
        a.add(4);
        System.out.println(b.size());  // 3 출력
        System.out.println(a == b);  // false 출력
    }
}
 */
