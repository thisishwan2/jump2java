package chap5;

class Cal{
    int value; //객체변수 생성

    Cal(){      //생성자 생성
        this.value=0;
    }

    void add (int val){
        this.value+=val;
    }

    int getValue(){
        return this.value;
    }
}

class UpgradeCal extends Cal{
    void minus(int val){
        this.value-=val;
    }
}

public class Num1 {
    public static void main(String[] args) {
        UpgradeCal cal=new UpgradeCal();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());
    }
}
