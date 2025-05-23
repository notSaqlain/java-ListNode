//File:Tree.java    Repository:java-ListNode
public class Tree<T extends Comparable<T>> {
    
    private Node<T> root;
    
    public Tree() {
        this.root = null;
    }
    
    public void insert(T value) {
        Node<T> newNode = new Node<>(value);
        if (root == null) {
            root = newNode;
            return;
        }

        Node<T> currentNode = root;
        while (true) {
            if (value.compareTo(currentNode.getValue()) < 0) {
                if (currentNode.getLeft() == null) {
                    currentNode.setLeft(newNode);
                    return;
                } else {
                    currentNode = currentNode.getLeft();
                }
            } else {
                if (currentNode.getRight() == null) {
                    currentNode.setRight(newNode);
                    return;
                } else {
                    currentNode = currentNode.getRight();
                }
            }
            
        }
    }

    public void visita(StringBuilder sb, Node<T> node) {
        if(n==null) {
            return;
        }
        if(node.getLeft() != null) {
            visita(sb, node.getLeft());
        }
        sb.append(node.getValue()).append(" ");
        if(node.getRight() != null) {
            visita(sb, node.getRight());
        }

        if(node.getRight() != null) {
            visita(sb, node.getRight());
        }
        sb.append(node.getValue()).append(" ");
        if(node.getLeft() != null) {
            visita(sb, node.getLeft());
        }

        if(node.getLeft() != null) {
            visita(sb, node.getLeft());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        visita(sb, root);
        return sb.toString();
    }
}