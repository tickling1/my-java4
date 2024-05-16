package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();
        BatchProcessor processor = new BatchProcessor(list); // O(n)
        processor.logic(100000);

        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        BatchProcessor processor2 = new BatchProcessor(list2); // O(1)
        processor2.logic(100000);
    }
}
