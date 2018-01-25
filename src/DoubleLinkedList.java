public class DoubleLinkedList {
    private Node first, last;
    private int size;

    public DoubleLinkedList() {
        first = new Node(null, null, null, null);
        last = new Node(null, null, first, null);
        first.setNext(last);
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // na początek
    public void push(Object element, String key) {
        Node node = new Node(key, element, first.getNext(), first);
        first.setNext(node);
        node.getNext().setPrev();
        size++;
    }

    // na koniec
//    public inje

    public Object locate(String key) {
        Node node = first;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        if (node.getKey().equals(key))
            return node;
        else
            return null;
    }

    public Node retrive(int key) {
        if (!isEmpty() && key <= size) {
            // optymalizajca -- użycie Node first i last
            if (size/2 > key) {
                Node node = first;
                for (int i = 1; i < key + 1; i++) {
                    node = node.getNext();
                }
                return node;
            } else  {
                Node node = last;
                for (int i = size - 2; i < key; i--) {
                    node = node.getPrev();
                }
                return node;
            }
        }
        return null;
    }
    public int size() {
        return size;
    }
}
