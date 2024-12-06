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

    public void addTail(T value) {
        Node<T> Tailnode = new Node<>(value);
        if (head == null) {
            head = Tailnode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(Tailnode);
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
