package genegic.ex3;

import genegic.animal.Animal;
import genegic.animal.Cat;
import genegic.animal.Dog;

public class AnimalHospitalMainV2 {

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Animal> animalHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
    }
}
