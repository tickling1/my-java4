package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0){
                break;
            } else {
                list.add(input);
            }
        }

        int total = 0;
        for (Integer integer : list) {
            total += integer;
        }
        System.out.println("합계: " + total);
        System.out.println("평균: " + (double)total / list.size());

    }
}
