package genegic.ex3;

import genegic.animal.Animal;
import genegic.animal.Cat;
import genegic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("바둑이1", 100);
        Cat cat = new Cat("야옹이1", 50);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        // 문제1: 개 병원에 고양이 전달
        dogHospital.set(cat); // 매개 변수 체크 실패: 컴파일 오류가 발생하지 않음

        // 문제2: 개 타입을 반환
        dogHospital.set(dog);
        Dog biggerDog =(Dog)dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
