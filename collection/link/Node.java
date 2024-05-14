package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

//    @Override
//    public String toString() {
//        return "Node{" + "item=" + item + ", next=" + next + '}';
//    }

    // [A->B->C]
//    @Override
//    public String toString() { // 내가 만든것!
//        String str = "[";
//        Node x = this;
//        while (x != null) {
//            if (x.next == null) {
//                str += x. item + "]";
//                return str;
//            }
//            str += x.item + "=>";
//            x = x.next;
//        }
//        return str;
//    }
    
    // [A->B->C]
    @Override
    public String toString() { // 문자열을 결합할 땐 가변문자열을 쓰자!
       StringBuilder sb = new StringBuilder();
       Node x = this;
       sb.append("[");

       while (x != null) {
           sb.append(x.item);
           if (x.next != null) {
               sb.append("->");
           }
           x = x.next;
       }

       sb.append("]");
       return sb.toString();
    }
}
