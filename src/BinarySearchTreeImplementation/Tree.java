package BinarySearchTreeImplementation;

public class Tree {

    Node root;

    public Tree() {
        this.root = null;
    }

    public void insert(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
            return;
        }
        Node curr = root;
        Node parent = null;
        while (true) {
            parent = curr;
            if (data < curr.data) {
                curr = curr.left;
                if (curr == null) {
                    parent.left = n;
                    return;
                }
            } else {
                curr = curr.right;
                if (curr == null) {
                    parent.right = n;
                    return;
                }
            }
        }
    }

    public boolean find(int data) {
        Node curr = root;
        if (root.data == data) {
            System.out.println("The data is the root value");
            return true;
        }
        if (data < root.data) {
            while (curr != null) {
                if (curr.data == data) {
                    System.out.println("Its in left subtree");
                    return true;
                }
                curr = curr.left;
            }
        } else if (data > root.data) {
            while (curr != null) {
                if (curr.data == data) {
                    System.out.println("Its in right subtree");
                    return true;
                }
                curr = curr.right;
            }
        }
        return false;
    }

    public void inorder(Node n) {
        if (n != null) {
            inorder(n.left);
            System.out.println(n.data);
            inorder(n.right);
        }
    }

    public boolean delete(int data) {
        Node curr = root;
        Node parent = null;
        boolean isLeftChild = false;
        while (curr.data != data) {
            parent = curr;
            if (data < curr.data) {
                curr = curr.left;
                isLeftChild = true;
            } else {
                curr = curr.right;
                isLeftChild = false;
            }
            if (curr == null) {
                return false;
            }
        }

        //if node has no children
        if (curr.left == null && curr.right == null) {
            if (curr == root) {
                root = null;
            }
            if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }

        //if node has a single child
        if (curr.left == null && curr.right != null) {
            if (curr == root) {
                root = curr.right;
            } else if (isLeftChild) {
                parent.left = curr.right;
            } else {
                parent.right = curr.right;
            }
        } else if (curr.right == null && curr.left != null) {
            if (curr == root) {
                root = curr.left;
            } else if (isLeftChild) {
                parent.left = curr.left;
            } else {
                parent.right = curr.right;
            }
        } else if (curr.left != null && curr.right != null) {

            Node successor = getSuccessor(curr);
            if (curr == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = curr.left;
        }
        return true;
    }

    private Node getSuccessor(Node deleteNode) {
        Node curr = deleteNode.right;
        Node successor = null;
        Node successorParent = null;
        while (curr != null) {
            successorParent = successor;
            successor = curr;
            curr = curr.left;
        }
        if (successor != deleteNode.right) {
            successorParent.left = successor.right;
            successor.right = deleteNode.right;
        }
        return successor;

    }
}
