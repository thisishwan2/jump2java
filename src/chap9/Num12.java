package chap9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//나의 조잡한 풀환
public class Num12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();

        //입력받은 String을 ""기준으로 쪼개서 alpha 배열에 넣기
        String[] alpha = input.split("");
        //alpha 배열을 list에 ArrayList로 저장
        ArrayList<String> list = new ArrayList<>(Arrays.asList(alpha));
        ArrayList<String> list1 = new ArrayList<>();
        //반복횟수 반복이 없는 경우 초기값 1
        int cnt=1;
        //list의 마지막 인덱스를 제외하고,반복여부 파악
        for (int i=0; i< list.size()-1; i++){
            if(list.get(i).equals(list.get(i+1))){
                cnt+=1; //반복시 1더하기
            }else{
                list1.add(list.get(i)); //반복이 아닐시 list1에 i번째 인덱스 추가
                list1.add(""+cnt);      //그 뒤에 반복 횟수 추가(""+)를 함으로써 문자열로 저장
                cnt=1;      //초기값 설정
            }
        }
        list1.add(list.get(list.size()-1)); //마지막 인덱스 추가
        list1.add(""+cnt);      //반복횟수 추가(이전문자와 다르면 1, 같으면 그동안의 cnt값)
        // String으로 변환
        String result="";
        for (String alphabet:list1){
            result+=alphabet;
        }
        System.out.println(result);
    }
}

/*
public class Num12 {
    static String compressString(String data) {
        String _c = "";  // data 문자열중 현재 진행중인 문자를 임시저장하기 위한 변수
        int cnt = 0;  // 해당 문자가 몇 번 반복했는지 알 수 있는 카운트 변수
        String result = "";
        for (String c : data.split("")) {  // 입력받은 문자열 data에서 문자 하나씩 c에 대입
            if (!c.equals(_c)) {  // 현재 진행중인 문자와 c가 같지 않은 경우, 즉 새로운 문자의 시작
                _c = c;  // 현재 진행중인 문자와 같지 않으므로 현재진행문자는 c로 대입
                if (cnt > 0) {  // 새로운 문자이므로 결과 문자열에 이전 문자의 카운트(있을 경우에만)에 해당하는 값을 더해 주어야 함
                    result += "" + cnt;
                }
                result += c;  // 새로운 문자이므로 결과문자열에 새로운 문자를 더함
                cnt = 1;  // 새로운 문자이므로 카운트는 1로 초기화

            } else {
                cnt += 1;  // 현재 진행중인 문자와 c가 같기 때문에 카운트가 증가됨
            }
        }
        if (cnt > 0) {  // for 문을 벗어낫을때 이전 문자의 카운트는 최종적으로 한번 더해주어야함
            result += "" + cnt;
        }
        return result;
    }

    public static void main(String[] args) {
        String result = compressString("aaabbcccccca");
        System.out.println(result);  // a3b2c6a1 출력
    }
}
 */
