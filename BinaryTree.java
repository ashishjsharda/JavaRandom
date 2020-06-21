/**
 * Node class
 * @author ashish
 */
class  Node{
    int data;
    Node left,right;
    Node next;
    public Node(int data){
        this.data=data;
        left=right=null;
    }

}

/**
 * Binary Tree
 * @author ashish
 */
public class BinaryTree {

    /**
     * Inorder traversal
     * @param node
     */
    public void inorder(Node node)
    {
        if(node!=null)
        {
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }

    /**
     * Using PreOrder traversal
     * @param node
     */
    public void preOrder(Node node)
    {
        if(node!=null)
        {
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }

    }

    /**
     * Using PostOrder traversal
     * @param node
     */
    public void postOrder(Node node)
    {
        if(node!=null)
        {
            preOrder(node.left);
            preOrder(node.right);
            System.out.println(node.data);

        }

    }
    public static void main(String[] args) {
        Node node=new Node(10);
        node.left=new Node(5);
        node.right=new Node(15);
        BinaryTree binaryTree=new BinaryTree();
        System.out.println("Inorder Traversal");
        binaryTree.inorder(node);
        System.out.println("Preorder Traversal");
        binaryTree.preOrder(node);
        System.out.println("Postorder Traversal");
        binaryTree.postOrder(node);
    }

}
