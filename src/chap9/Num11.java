package chap9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//내가짠 두서없는 코드..
public class Num11 {
    static String DashInsert(String s){
        String[] numbers = s.split("");
        int[] arr=new int[numbers.length];
        for(int j=0; j< numbers.length; j++){
            arr[j]=Integer.parseInt(numbers[j]);
        }
        ArrayList<String> newlist = new ArrayList<>();

        for(int i=0; i< arr.length-1; i++){
            newlist.add(Integer.toString(arr[i]));
            if (arr[i]%2==0&&arr[i+1]%2==0){
                newlist.add("*");
            } else if (arr[i]%2==1&&arr[i+1]%2==1) {
                newlist.add("-");
            }
        }if (arr[arr.length-1]%2==0&&arr[arr.length-1]%2==0) {
            newlist.add(Integer.toString(arr[arr.length-1]));
        } else if (arr[arr.length-1]%2==1&&arr[arr.length-1]%2==1) {
            newlist.add(Integer.toString(arr[arr.length-1]));
        }
        String num="";
        for(String str:newlist){
            num+=str;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(DashInsert(sc.nextLine()));

    }
}


/*
import java.util.ArrayList;
import java.util.Arrays;

public class Num11 {
    static String dashInsert(String data) {
        int[] numbers = Arrays.stream(data.split(""))  // 숫자 문자열을 정수 배열로 변경
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            resultList.add("" + numbers[i]);
            if (i < numbers.length - 1) {  // 다음 수가 있다면
                boolean isOdd = numbers[i] % 2 == 1;  // 현재 수가 홀수인지 여부
                boolean isNextOdd = numbers[i + 1] % 2 == 1;  // 다음 수가 홀수인지 여부
                if (isOdd && isNextOdd) {  // 두 수가 연속해서 홀수인 경우
                    resultList.add("-");
                } else if (!isOdd && !isNextOdd) {  // 두 수가 연속해서 짝수인 경우
                    resultList.add("*");
                }
            }
        }
        return String.join("", resultList); //문자열로 변환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(DashInsert(sc.nextLine()));  // 454*67-9-3 출력
    }
}

 */
