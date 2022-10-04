package chap8;

public class Num4 {

    static int getCount(String a){
        a=a.replaceAll(" ","");
        int len=a.length();
        return len;
    }

    public static void main(String[] args) {
        System.out.println(getCount("공백을 제외한 글자수"));
        System.out.println(getCount("점프 투 자바의 연습문제 풀이"));
    }
}
