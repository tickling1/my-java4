package genegic.ex3;


public class AnimalHospitalV2<T> { // Animal 타입만 있ㅇ

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }
    public void checkUp() {
        // T의 타입은 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용가능
        animal.hashCode();
        animal.toString();
        animal.equals(null);
    }
    public T getBigger(T target) {
        // 컴파일 오류
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
