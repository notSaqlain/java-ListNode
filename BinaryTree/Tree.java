//
public class Tree<T extends Comparable<T>> {
    
    private Node<T> root;
    
    public Tree() {
        this.root = null;
    }
    
    public void insert(T value) {
        root = insertRec(root, value);
    }
    
    private Node<T> insertRec(Node<T> root, T value) {
        if (root == null) {
            root = new Node<>(value);
            return root;
        }
        
        if (value.compareTo(root.getValue()) < 0) {
            root.setPrev(insertRec(root.getPrev(), value));
        } else if (value.compareTo(root.getValue()) > 0) {
            root.setNext(insertRec(root.getNext(), value));
        }
        
        return root;
    }
}