package chap5;

interface Predator {
}

class Animal {
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
}

public class Num8 {
    public static void main(String[] args) {
        Animal a = new Animal();  // 1번 오류 x
        Animal b = new Dog();  // 2번 오류 x
        Animal c = new Lion();  // 3번 오류 x
        //Dog d = new Animal();  // 4번 오류 o Dog은 Animal의 자식 클래스 이므로 Dog is Animal 관계임
        Predator e = new Lion();  // 5번 오류 x
    }
}
    //4번 Dog 클래스는 Animal의 자식 클래스로 IS-A 관계가 성립될 수 없기 때문이다.