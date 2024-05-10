package genegic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {

        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // Object => Integer 캐스팅
        //Object object = integerBox.get();
        //Integer integer = (Integer) object;

        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // Object => String 캐스팅

        System.out.println("str = " + str);

        // 잘못된 타입의 인수 전달시
        integerBox.set("100");
        Integer integer2 = (Integer) integerBox.get();
        System.out.println("integer2 = " + integer2); // String => Integer 캐스팅 형변환 예외
    }
}
