package genegic.ex4;

import genegic.animal.Animal;
import genegic.animal.Cat;
import genegic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("흰둥이", 100);
        Cat cat = new Cat("도라이몽", 1000);

        AnimalMethod.<Dog>checkUp(dog);
        AnimalMethod.<Cat>checkUp(cat);

        Animal animal = AnimalMethod.<Animal>getBigger(dog, cat);
        System.out.println("bigger = " + animal);
        Dog bigger = AnimalMethod.<Dog>getBigger(dog, new Dog("검둥이", 150));
        System.out.println("bigger = " + bigger);
    }
}
