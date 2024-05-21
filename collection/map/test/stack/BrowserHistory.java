package collection.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> histoty = new ArrayDeque<>();
    private String currentPage = null;


    public void visitPage(String url) {
        if (currentPage != null) {
            histoty.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (histoty.isEmpty()) {
            System.out.println("더 이상 뒤로 갈 수 없습니다.");
        }
        currentPage = histoty.pop();
        System.out.println("뒤로 가기: " + currentPage);
        return currentPage;
    }
}
