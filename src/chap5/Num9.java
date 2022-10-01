package chap5;

interface Predato {
    String bark();
}

abstract class Anima {
    public String hello() {
        return "hello";
    }
}

class Do extends Anima {
}

class Lio extends Anima implements Predato {
    public String bark() {
        return "Bark bark!!";
    }
}

public class Num9 {
    public static void main(String[] args) {
        Anima a = new Lio();
        Lio b = new Lio();
        Predato c = new Lio();

        System.out.println(a.hello());  // 1번
        //System.out.println(a.bark());   // 2번 오류발생 a는 Animal 타입으로 객체가 생성되어서 Animal 메소드인 hello만 사용가능
        System.out.println(b.hello());  // 3번
        System.out.println(b.bark());   // 4번 3번,4번은 Lion 타입으로 Animal 상속에 Predator 구현까지 했으므로 hello, bark 메소드 둘다 사용가능
        //System.out.println(c.hello());  // 5번 오류 발생 c는 Predator 타입으로 객체가 생성되어서 Predator 메소드인 bark만 사용가능
        System.out.println(c.bark());   // 6번
    }
}