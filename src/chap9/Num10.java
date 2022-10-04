package chap9;

import java.util.Random;

class OddException extends Exception{
}

public class Num10 {
    //첫번째 풀이 main 메서드의 for문 안으로 try~catch문을 넣는다.
    static void execute(int n) throws OddException {
        System.out.printf("입력 숫자: %d\n", n);
        if (n % 2 == 1) {
            throw new OddException();
        }
        System.out.println("짝수입니다");
    }

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            try {  // for문 안쪽에 try .. catch 문을 위치시켰다.
                execute(r.nextInt(10));
            } catch (OddException e) {
                e.printStackTrace(); //에러의 발생근원지를 찾아서 단계별로 에러를 출력합니다.
            }
        }
    }
}

/* execute 메서드에서 OddException을 throw하지 않고 직접 처리
    static void execute(int n) {  // execute 메서드내에서 OddException을 직접 처리했다.
        System.out.printf("입력 숫자: %d\n", n);
        try {
            if (n % 2 == 1) {  // 홀수이면 OddException이 발생한다.
                throw new OddException();
            }
            System.out.println("짝수입니다.");
        } catch (OddException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            execute(r.nextInt(10));
 */
