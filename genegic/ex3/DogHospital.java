package genegic.ex3;

import genegic.animal.Dog;

public class DogHospital {

    private Dog animal;

    public void set(Dog animal) {
        this.animal = animal;
    }
    public void checkUp() {
        System.out.println("동물 이름 :" + animal.getName());
        System.out.println("동물 크기 :" + animal.getSize());
        animal.sound();
    }
    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
