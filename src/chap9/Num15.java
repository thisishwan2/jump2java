package chap9;

import java.util.ArrayList;
import java.util.Scanner;

public class Num15 {
    static String ciger(String data, int n){
        String alpha="ABCDEFGHIJKLMNOPQRSTUVXYZ";
        ArrayList<String> list = new ArrayList<>();
        for (String letter:data.split("")) {
            int pos=alpha.indexOf(letter);  //letter문자의 시작 인덱스
            int newpos= pos+n;              //n만큼 더해줌
            newpos=newpos%alpha.length();   // z를 넘어가면 다시 a부터
            list.add(alpha.substring(newpos, newpos+1));
        }
        return String.join("",list);
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Scanner word=new Scanner(System.in);

        System.out.println(ciger(word.nextLine(),n.nextInt()));

    }
}
