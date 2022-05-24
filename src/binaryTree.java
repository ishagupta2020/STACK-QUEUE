import java.util.Stack;

public class binaryTree {
    private treeNode root;
    private class treeNode{
        private int data;
        private treeNode left;
        private treeNode right;

    public treeNode(int data){
    this.data=data;
    }
    }
    public void createBinaryTree(){
        treeNode first=new treeNode(1);
        treeNode second=new treeNode(2);
        treeNode third=new treeNode(3);
        treeNode fourth=new treeNode(4);
        treeNode fifth=new treeNode(5);
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
    }
    // PREORDER TRAVERSAL
    public void preorder(){
        if(root==null){
            return;
        }
        Stack<treeNode>stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            treeNode temp=stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
        System.out.println();
    }
    // INORDER TRAVERSAL
    public void inOrder(){
        if(root==null){
            return;
        }
        Stack <treeNode> stack=new Stack<>();
        treeNode temp=root;
        while(!stack.isEmpty()|| temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            else{
                temp=stack.pop();
                System.out.print(temp.data +" ");
                temp=temp.right;
            }
        }
    }

    public static void main(String[] args) {
        binaryTree bt=new binaryTree();
        bt.createBinaryTree();
        bt.preorder();
        bt.inOrder();

    }
}
