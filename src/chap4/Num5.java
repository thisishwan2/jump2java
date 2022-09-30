package chap4;

public class Num5 {
    public static void main(String[] args) {
        int sum=0;
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        for(int mark: marks){
            sum+=mark;
        }
        double avg=sum/marks.length;        //float avg=(float)sum/marks.length;
        System.out.println(avg);
    }
}
