import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class binaryTree {
    private treeNode root;

    private class treeNode {
        private int data;
        private treeNode left;
        private treeNode right;

        public treeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        treeNode first = new treeNode(1);
        treeNode second = new treeNode(2);
        treeNode third = new treeNode(3);
        treeNode fourth = new treeNode(4);
        treeNode fifth = new treeNode(5);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }

    // PREORDER TRAVERSAL
    public void preorder() {
        if (root == null) {
            return;
        }
        Stack<treeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            treeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
        System.out.println();
    }

    // INORDER TRAVERSAL
    public void inOrder() {
        if (root == null) {
            return;
        }
        Stack<treeNode> stack = new Stack<>();
        treeNode temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
        System.out.println();
    }

    // POSTORDER TRAVERSAL
    public void postOrder() {
        Stack<treeNode> stack=new Stack<>();
        treeNode current = root;
        while (current != null || !stack.isEmpty()) {
            if(current!=null){
                stack.push(current);
                current=current.left;
            }
            else{
                treeNode temp=stack.peek().right;
                if(temp==null){
                    temp=stack.pop();
                    System.out.print(temp.data+ " ");
                    while(!stack.isEmpty() && temp==stack.peek().right){
                        temp=stack.pop();
                        System.out.print(temp.data+" ");
                    }
                }
                else{
                    current=temp;
                }
            }

        }
    }
    // LEVEL ORDER TRAVERSAL
    public void levelOrderTraversal(){
        if(root==null){
            System.out.println("empty");
        }
        Queue <treeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            treeNode temp=queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
    }



    public static void main(String[] args) {
        binaryTree bt=new binaryTree();
        bt.createBinaryTree();
        bt.preorder();
        bt.inOrder();
        bt.postOrder();
        System.out.println();
        bt.levelOrderTraversal();

    }
}
