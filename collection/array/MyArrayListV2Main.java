package collection.array;

public class MyArrayListV2Main {

    public static void main(String[] args) {

        MyArrayListV2 list = new MyArrayListV2();
        System.out.println("== 데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("==범위 초과 안됨==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        
        // 범위 초가, 배열(capacity)의 크기가 늘어나지 않으면 예외 발생
        list.add("f");
        System.out.println(list);
    }
}
