public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /*
    public void addHead(Node<T> node) {
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }
    */
    public void addHead(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    @Override
    public String toString() {
        String result = " La lista contiene: ";
        Node<T> current = head;
        while (current != null) {
            result += current.getValue() + " ";
            current = current.getNext();
        }
        return result;

    }

}
