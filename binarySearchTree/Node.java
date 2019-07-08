package binarySearchTree;

public class Node {

    int key;    // integer value of the tree that helps us decide where to put the data
    String value;   // some other value that we can put into the nodes of the tree
    Node leftChild, rightChild;

    public Node(int key, String value){
        super();
        this.key = key;
        this.value = value;
    }
}
