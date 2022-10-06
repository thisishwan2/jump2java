package chap9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//내가짠 두서없는 코드..
public class Num11 {
    static String DashInsert(String s){
        String[] numbers = s.split("");     //입력받은 s를 ""기준으로 나누어서 numbers 배열에 저장
        int[] arr=new int[numbers.length];      //numbers의 길이만큼 arr배열을 만든다.
        for(int j=0; j< numbers.length; j++){
            arr[j]=Integer.parseInt(numbers[j]);//for문을 돌면서 numbers의 원소들을 정수로 변환해 arr에 저장한다.
        }
        ArrayList<String> newlist = new ArrayList<>();//ArrayList newlist를 생성한다.
        //arr i인덱스와 i+1인덱스를 비교
        for(int i=0; i< arr.length-1; i++){ //arr의 길이-1만큼 for문을 돌린다.
            newlist.add(Integer.toString(arr[i]));  //newlist에 i번째 arr를 추가한다.
            if (arr[i]%2==0&&arr[i+1]%2==0){        //만약 i번째와 i+1번째(이어지는 두수) arr가 짝수면
                newlist.add("*");                   //newlist에 '*'추가
            } else if (arr[i]%2==1&&arr[i+1]%2==1) {//만약 i번째와 i+1번째(이어지는 두수) arr가 홀수면
                newlist.add("-");                   //newlist에 '-'추가
            }
        }
        //arr의 마지막 인덱스추가
        newlist.add(Integer.toString(arr[arr.length-1]));
        String num="";
        //ArrayList 문자열로 변환
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
