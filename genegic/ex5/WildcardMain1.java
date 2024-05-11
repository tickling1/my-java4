package genegic.ex5;

import genegic.animal.Animal;
import genegic.animal.Cat;
import genegic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));
        WildcardEx.<Dog>printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        System.out.println();
        WildcardEx.<Dog>printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);
        //WildcardEx.printWildcardV2(objBox); 컴파일 오류


        System.out.println();
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);


        //Cat cat = WildcardEx.<Cat>printAndReturnGeneric(catBox); // 타입추론
       // WildcardEx.printGenericV1(catBox); // 타입추론
    }
}
