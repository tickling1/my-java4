package collection.list.test.ex1;

import java.util.ArrayList;

public class ListEx1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int total = 0;
        list.add(90);
        list.add(80);
        list.add(70);
        list.add(60);
        list.add(50);

        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + (double) total / list.size());
    }
}
