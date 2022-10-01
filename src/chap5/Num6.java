package chap5;

class Calcu {
    Integer value;      //Integer 자료형은 값을 대입하지 않으면 null을 출력함.

    Calcu(){            //생성자를 통해 초기값을 생성해야함
        this.value=0;
    }

    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}

public class Num6 {
    public static void main(String[] args) {
        Calcu cal = new Calcu();
        cal.add(3);  // 여기서 NullPointerException 이 발생한다. 해결
        System.out.println(cal.getValue());
    }
}/*
class Calculator {
    int value;  //사실 이부분만 int로 바궈도 int자료형은 초기값이 0이라 정상 작동
    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}

public class Sample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(3);  // 여기서 NullPointerException 이 발생한다.
        System.out.println(cal.getValue());
    }
}
*/