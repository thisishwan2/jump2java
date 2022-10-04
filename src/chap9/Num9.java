package chap9;
class Calculator{
    int[] data;
    int total=0;
    Calculator(int[] data){
        this.data=data; //이걸 안하면 클래스 필드의 data와 동일해지지 않음.
        for(int num:this.data){
           this.total += num;
        }
    }

    int sum(){
        return this.total;
    }

    float avg(){
        float avg = (float) this.total/ this.data.length;
        return avg;
    }
}


public class Num9 {
    public static void main(String[] args) {
        int[] data1 = {1,2,3,4,5};
        Calculator cal1 = new Calculator(data1);
        System.out.println(cal1.sum()); // 15 출력
        System.out.println(cal1.avg()); // 3.0 출력

        int[] data2 = {6,7,8,9,10};
        Calculator cal2 = new Calculator(data2);
        System.out.println(cal2.sum()); // 40 출력
        System.out.println(cal2.avg()); // 8.0 출력
    }
}
