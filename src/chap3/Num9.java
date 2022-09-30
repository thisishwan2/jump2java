package chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Num9 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
        HashSet<Integer> set = new HashSet(myList);
        ArrayList<Integer> result = new ArrayList<>(set);
        System.out.println(result);
    }
}
