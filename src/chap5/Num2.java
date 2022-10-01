package chap5;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

class MaxLimitCal extends Calculator{
    void add(int val){
        this.value+=val;
        if (this.value>100){
            this.value= 100;
        }
    }
}
public class Num2 {
    public static void main(String[] args) {
        MaxLimitCal cal = new MaxLimitCal();
        cal.add(50);  // 50 더하기
        cal.add(60);  // 60 더하기
        System.out.println(cal.getValue());  // 100 출력
    }
}
