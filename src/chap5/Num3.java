package chap5;

class Calcul {
    int value;

    Calcul() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    boolean isOdd(int num){
        return num%2==1;
    }
}

public class Num3 {
    public static void main(String[] args) {
        Calcul calculator = new Calcul();
        System.out.println(calculator.isOdd(3));
        System.out.println(calculator.isOdd(4));
    }
}
