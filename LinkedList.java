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

    public void remove(T value) throws Exception {
        if (head == null) {
            throw new Exception("Lista vuota!");
        }

        if (head.getValue().equals(value)) {
            head = head.getNext();
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(value)) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
        throw new Exception("Elemento non trovato!");
    }

    public void LastFirst() throws Exception {
        if (head == null || head.getNext() == null) {
            throw new Exception("Lista vuota o con un solo elemento!");
        }
    
        Node<T> first = head;
        Node<T> prevToLast = null;
        Node<T> last = head;
    
        // Traverse to find the last node and its previous node
        while (last.getNext() != null) {
            prevToLast = last;
            last = last.getNext();
        }
    
        // Update pointers to swap the first and last nodes
        prevToLast.setNext(first); // Previous to last node points to the first node
        last.setNext(first.getNext()); // Last node points to the second node
        first.setNext(null); // First node becomes the new last node
        head = last; // Update head to point to the new first node
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
