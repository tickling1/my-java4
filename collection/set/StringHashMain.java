package collection.set;

import static collection.set.HashStart5.CAPACITY;

public class StringHashMain {

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);

        // hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        // hashIndex
        int hashIndex = hashIndex(hashCode("AB"));
        System.out.println("hashIndex('AB') = " + hashIndex);
    }
    static int hashCode(String str) {
        // 65 + 66
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c: charArray) {
            sum += (int)c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
