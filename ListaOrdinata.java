public class ListaOrdinata<T extends Comparable<T>> extends LinkedList<T> {

    @Override
    public void addHead(T newval) {
        Node<T> newnode = new Node<>(newval);
        if (head==null) { head = newnode; return; }
        Node<T> temp = head;
        if (head.getValue().compareTo(newval) > 0) {
            newnode.setNext(head);
            head = newnode;
            return;
        }
        while (temp.getNext()!=null && temp.getNext().getValue().compareTo(newval) <0){
            temp=temp.getNext();
        }
        newnode.setNext(temp.getNext());
        temp.setNext (newnode);
    }
    
}