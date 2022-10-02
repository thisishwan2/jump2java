package chap7;

import java.util.Arrays;

public class Num4 {
    public static void main(String[] args) {
        int b=2;
        int[] numbers = {1, 2, 3, 4, 5};
        int[] data = Arrays.stream(numbers) //IntStream 생성
                .filter((a)-> a%2==1)   //홀수 뽑기
                .map((a)-> a*2)         //2곱하기
                .toArray()              //int[]배열로 반환
                ;
//boxed() 메소드는 IntStream 같이 원시 타입에 대한 스트림 지원을 클래스 타입(예: IntStream -> Stream<Integer>)으로 전환하여 전용으로 실행 가능한 (예를 들어 본문과 같이 int 자체로는 Collection(List, Set에 못 담기 때문에 Integer 클래스로 변환하여 List<Integer> 로 담기 위해 등) 기능을 수행하기 위해 존재합니다.
        }
    }
