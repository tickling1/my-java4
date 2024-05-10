package genegic.ex3;

import genegic.animal.Cat;
import genegic.animal.Dog;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("바둑이1", 100);
        Cat cat = new Cat("야옹이1", 50);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();
        
        // 문제1: 개 병원에 고양이 전달
        // dogHospital.checkUp(cat); // 다른 타입을 입력: 컴파일 오류

        // 문제2: 개 타입을 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
