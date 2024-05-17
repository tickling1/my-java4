package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {

    public static void main(String[] args) {
        // 중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashEq m1 = new MemberNoHashEq("A");
        MemberNoHashEq m2 = new MemberNoHashEq("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 실패
        MemberNoHashEq searchValue = new MemberNoHashEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);
    }
}
