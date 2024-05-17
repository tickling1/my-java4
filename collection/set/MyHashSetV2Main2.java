package collection.set;


import collection.set.member.Member;

public class MyHashSetV2Main2 {

    public static void main(String[] args) {

        Member member1 = new Member("hi");
        Member member2 = new Member("JPA"); // 대문자 주의!
        Member member3 = new Member("java");
        Member member4 = new Member("spring");

        System.out.println("hi.hashCode() = " + member1.hashCode());
        System.out.println("JPA.hashCode() = " + member2.hashCode());
        System.out.println("java.hashCode() = " + member3.hashCode());
        System.out.println("spring.hashCode() = " + member4.hashCode());

        MyHashSetV2 set =  new MyHashSetV2(10);
        set.add(member1);
        set.add(member2);
        set.add(member3);
        set.add(member4);
        System.out.println(set);

        // 검색
        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);
        System.out.println("set.contains (" + searchValue + ") = " + result);
    }
}
