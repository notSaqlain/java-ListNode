public class ListaOrdinata<T extends Comparable<T>> extends LinkedList<T> {

    @Override
    public void addHead(T newval){
        Node<T> newnode = new Node<>(newval);
        if(head == null){
            head = newnode;
        } else {
            Node<T> temp = head;
            while(temp.getValue().compareTo(newval)>0 && temp.getNext()!=null) temp = temp.getNext();
            newnode.setNext(temp.getNext());
            temp.setNext(newnode);
        }
    }
    
}