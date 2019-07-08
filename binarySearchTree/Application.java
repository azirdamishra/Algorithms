package binarySearchTree;

public class Application {
    public static void main(String[] args) {
        BST newTree = new BST();
        newTree.insert(10, "ten");
        newTree.insert(20, "twenty");
        newTree.insert(15, "fifteen");


//        System.out.println(newTree.findMax());
//        System.out.println(newTree.findMin());
//        // the nodes themselves are returned above
//        // therefore their instances are printed
//        System.out.println(newTree.findMax().key);
//        System.out.println(newTree.findMin().key);

        System.out.println(newTree.remove(10)); // returns true on removal of key 10
        System.out.println(newTree.findMin().key);  // prints 15

    }
}
