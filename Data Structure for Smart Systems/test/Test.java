package test;


import javax.swing.JOptionPane;


public class Test {


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insertNo(Integer.parseInt(JOptionPane.showInputDialog("Type a integer")));
        tree.insertNo(Integer.parseInt(JOptionPane.showInputDialog("Type a integer")));
        tree.insertNo(Integer.parseInt(JOptionPane.showInputDialog("Type a integer")));
        tree.insertNo(Integer.parseInt(JOptionPane.showInputDialog("Type a integer")));
        tree.insertNo(Integer.parseInt(JOptionPane.showInputDialog("Type a integer")));
        tree.exibirNo();
        System.exit(0);
    }


}