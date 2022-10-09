package chap9;

import java.util.ArrayList;
import java.util.HashMap;

public class Num14 {
    static String translate(String dotdash) {
        HashMap<String, String> map = new HashMap<>() {{   //{{을 이용하여 여러개 put
            //원래는 map.put해야함
            put(".-", "A");
            put("-...", "B");
            put("-.-.", "C");
            put("-..", "D");
            put(".", "E");
            put("..-.", "F");
            put("--.", "G");
            put("....", "H");
            put("..", "I");
            put(".---", "J");
            put("-.-", "K");
            put(".-..", "L");
            put("--", "M");
            put("-.", "N");
            put("---", "O");
            put(".--.", "P");
            put("--.-", "Q");
            put(".-.", "R");
            put("...", "S");
            put("-", "T");
            put("..-", "U");
            put("...-", "V");
            put(".--", "W");
            put("-..-", "X");
            put("-.--", "Y");
            put("--..", "Z");
        }};

        ArrayList<String> list = new ArrayList<>();
        for (String word : dotdash.split("  ")) {//공백 두개짜리로 먼저 나누고
            for (String str : word.split(" ")) {//공백 하나로 나눔
                list.add(map.get(str));
            }
            list.add(" ");
        }
        return String.join("",list);
    }
    public static void main(String[] args) {
        String dotdash = ".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--";
        System.out.println(translate(dotdash));
    }
}
