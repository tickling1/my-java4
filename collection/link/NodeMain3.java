package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A-> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("연결된 노드 출력하기");
        System.out.println(first);
        
        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);
        
        // 마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println(lastNode);
        
        // 특정 인덱스의 노드 아이템 조회하기
        int index = 1;
        Node indexNode = getNode(first, index);
        System.out.println(indexNode.item);
        
        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);

        add(first, "E");
        add(first, "F");
        System.out.println(first);

    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x; // x.next가 null
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }
}
