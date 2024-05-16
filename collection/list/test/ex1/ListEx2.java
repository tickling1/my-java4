package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0){
                break;
            } else {
                list.add(input);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < (list.size() - 1)){
                break;
            }
            sb.append(", ");
        }

        System.out.println(sb);
    }
}
