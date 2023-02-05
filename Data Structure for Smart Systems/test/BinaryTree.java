package test;


public class BinaryTree {


    private BIntNo Root;


    private BIntNo insert(BIntNo tree, int newNo) {
        if (tree == null) {
            return new BIntNo(newNo);
        } else if (newNo < tree.value) {
            tree.left = insert(tree.left, newNo);
        } else {
            tree.right = insert(tree.right, newNo);
        }
        return tree;


    }


    public void insertNo(int newValue) {
        Root = insert(Root, newValue);
    }


    private void exhibitLeft(BIntNo t) {
        if (t != null) {
            exhibitLeft(t.left);
            System.out.println(t.value);
        }
    }


    private void exhibitRight(BIntNo t) {
        if (t != null) {
            exhibitRight(t.right);
            System.out.println(t.value);
        }
    }


    public void exhibitRoot() {
        System.out.println("root" + Root.value);
    }


    public void exhibitNoLeft() {
        exhibitLeft(Root);
    }


    public void exhibitNoRight() {
        exhibitRight(Root);
    }


    public void exhibitNo() {
        exhibitNoLeft();
        exhibitRoot();
        exhibitNoRight();
    }


}