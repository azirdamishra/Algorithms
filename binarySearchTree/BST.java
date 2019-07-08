package binarySearchTree;

public class BST {

    private Node root;

    public void insert(int key, String value){
        Node newNode = new Node(key, value);

        if(root == null){
            root = newNode;
        }else{

            Node current = root; // traversing variable that points to current node
            Node parent;    // parent of the current node

            while(true){
                parent = current;
                if(key < current.key){
                    current = current.leftChild;
                    if(current == null){        // its parent is the leaf node
                        parent.leftChild = newNode;
                        return;
                    }

                }else{
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }

        }
    }

    public Node findMin(){
        Node current =root;
        Node last = null;

        while(current != null){
            last = current;
            current = current.leftChild;
        }
        return last;    // last node that doesn't have any left child is the smallest
    }

    public Node findMax(){
        Node current =root;
        Node last = null;

        while(current != null){
            last = current;
            current = current.rightChild;
        }
        return last;    // last node that doesn't have any right child is the largest
    }

    public boolean remove(int key){

        Node currentNode = root;
        Node parentNode = root;
        boolean isLeftChild = true;

        // searching to find the node with the same key to be deleted

        while(currentNode.key != key){
            parentNode = currentNode;
            if(key < currentNode.key){
                isLeftChild = true;
                currentNode = currentNode.leftChild;
            }else{
                currentNode = currentNode.rightChild;
                isLeftChild = false;
            }

            if(currentNode == null){
                return false;
            }
        }
        // node is found

        Node nodeToDelete = currentNode; // currentNode was the one used for traversing the loop

        //if node is a leaf
        if(nodeToDelete.leftChild == null && nodeToDelete.rightChild == null){

            if(nodeToDelete == root){
                root = null;
            }else if(isLeftChild){
                parentNode.leftChild = null;
            }else{
                parentNode.rightChild = null;
            }
        }
        // if node has one child that is on the right
        else if(nodeToDelete.leftChild == null){
            if(nodeToDelete == root){
                root = nodeToDelete.rightChild;
            }else if(isLeftChild){
                parentNode.leftChild = nodeToDelete.rightChild;
            }else{
                parentNode.rightChild = nodeToDelete.rightChild;
            }
        }
        // if node has one child that is on the left
        else if(nodeToDelete.rightChild == null){
            if(nodeToDelete == root){
                root = nodeToDelete.leftChild;
            }else if(isLeftChild){
                parentNode.leftChild =nodeToDelete.leftChild;
            }else{
                parentNode.rightChild = nodeToDelete.leftChild;
            }
        }

        // if node has two children
        else{
            Node successor = getSuccessor(nodeToDelete);

            //connect parent of nodeToDelete to successor instead

            if(nodeToDelete == root){
                root = successor;
            }else if(isLeftChild){
                parentNode.leftChild = successor;
            }else{
                parentNode.rightChild = successor;
            }

            successor.leftChild = nodeToDelete.leftChild;

        }


        return true;
    }

    private Node getSuccessor(Node nodeToDelete){

        Node successorParent = nodeToDelete;
        Node successor = nodeToDelete;

        Node current = nodeToDelete.rightChild; //go to right child

        while(current != null){     //start going left on the tree until node has no left child
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }

        // if successor is not a right child
        if(successor != nodeToDelete.rightChild){
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = nodeToDelete.rightChild;
        }

        return successor;
    }
}
