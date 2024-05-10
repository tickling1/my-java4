package genegic.ex4;

import genegic.animal.Animal;
import genegic.animal.Cat;
import genegic.animal.Dog;

public class MethodMain3 {

    public static void main(String[] args) {

        Dog dog = new Dog("몽몽이", 100);
        Cat cat = new Cat("냥냥이", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.<Cat>printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
