public class LinkedList<T> {
    protected Node<T> head;
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
        Node<T> temp = null;
        Node<T> last = head;
    
        while (last.getNext() != null) {
            temp = last;
            last = last.getNext();
        }
    
        temp.setNext(first);
        last.setNext(first.getNext());
        first.setNext(null);
        head = last;
    }

    public void erase(T value) throws Exception {
        if (head == null) {
            throw new Exception("Lista vuota!");
        }

        while (head != null && head.getValue().equals(value)) {
            head = head.getNext();
        }
    
        if (head == null) {
            return;
        }
    
        Node<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(value)) {
                current.setNext(current.getNext().getNext());
            } else {
                current = current.getNext();
            }
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
