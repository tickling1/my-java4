package genegic.ex1;

public class RawTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        integerBox.set(100);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
