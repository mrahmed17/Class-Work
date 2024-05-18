package testbinarysearch;

public class E {

    public boolean search(E element) {
        TreeNode<E> current = null;
        while (current != null) {
            if (element < current.element) {
                current = current.left;
            } else if (element > current.element) {
                current = current.right;
            } else {
                return true;
            }
        }

        return false;
    }

}
