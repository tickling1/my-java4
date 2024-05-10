package genegic.ex4;


import genegic.animal.Animal;

public class AnimalMethod {
    public static <T extends Animal> void checkUp(T t) {
        System.out.println("동물 이름: " + t.getName());
        System.out.println("동물 크기: " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T getBigger (T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
