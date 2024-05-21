package collection.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class SimpleHistoryTest {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("youbute.com");
        stack.push("google.com");
        stack.push("facebook.com");

        for (int i = stack.size(); i > 0; i--) {
            System.out.println(stack.pop());
        }
    }
}
