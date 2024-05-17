package collection.set;


public class MyHashSetV1Main {

    public static void main(String[] args) {

        // MyHashSetV1 set = new MyHashSetV1();
        MyHashSetV1 set = new MyHashSetV1(10); //capacity 조절
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        boolean b = set.add(9); // hashIndex 중복
        System.out.println(set);
        System.out.println(b);

        // 검색
        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains("+ searchValue +") = " + result);

        // 삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println(set);
    }
}
