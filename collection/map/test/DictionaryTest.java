package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        System.out.println("== 단어 입력 단계 ==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String inputEng = scanner.nextLine();

            if (inputEng.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String inputKor = scanner.nextLine();
            map.put(inputEng, inputKor);
        }

        System.out.println("== 단어 검색 단계 ==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String outEng = scanner.nextLine();
            if (outEng.equals("q")) {
                System.exit(0);
            } else if (map.get(outEng) == null) {
                System.out.println(outEng + "은(는) 없는 단어 입니다.");
                continue;
            }

            String outKor = map.get(outEng);
            System.out.println(outEng + "의 뜻: " + outKor);
        }
    }
}
