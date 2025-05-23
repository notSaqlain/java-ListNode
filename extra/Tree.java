package extra;
public class Tree <T extends Comparable<T>> {
    private TreeNode<T> root;

    public Tree() {
        this.root = null;   
    }

    public void add(T value) {
        TreeNode<T> newNode = new TreeNode<>(value);
        if (root == null) {
            root = newNode;
        } else {
            while(true) {
                if (value.compareTo(root.getValue()) < 0) {
                    if (root.getLeft() == null) {
                        root.setLeft(newNode);
                        break;
                    } else {
                        root = root.getLeft();
                    }
                } else if (value.compareTo(root.getValue()) > 0) {
                    if (root.getRight() == null) {
                        root.setRight(newNode);
                        break;
                    } else {
                        root = root.getRight();
                    }
                } else {
                    break;
                }
            }
        }
    }
}