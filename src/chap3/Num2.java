package chap3;

public class Num2 {
    public static void main(String[] args) {
        A a = new A();
        a.getNum(12);
        a.getNum(13);
        a.getNum(14);
    }
}
class A{
    void getNum(int a){
        if(a%2==0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }
    }
}
