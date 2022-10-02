package chap7;


import java.util.ArrayList;

class HeavyWork implements Runnable {
    String name;

    HeavyWork(String name) {
        this.name = name;
    }

    public void work() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);  // 0.1 초 대기한다.
            } catch (Exception e) {
            }
        }
        System.out.printf("%s done.\n", this.name);
    }

    @Override
    public void run() {
        work(); //run은 무조건 수행되므로 work메서드를 수행해주자

    }
}

public class Num3 {
    public static void main(String[] args) throws InterruptedException{
        long start = System.currentTimeMillis(); //1970년 부터 지금가지의 시간을 밀리세컨드로 반환
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 1; i < 5; i++) { //총 5개의 스레드 생성
            Thread thread = new Thread(new HeavyWork("W"+i));
            thread.start();
            threads.add(thread);
        }
        for (int i = 0; i< threads.size(); i++){
            Thread thread = threads.get(i);
            try{
                thread.join();
            } catch (InterruptedException e) {
            }
        }

        long end = System.currentTimeMillis();
        System.out.printf("elapsed time:%s ms\n", end - start);
    }
}