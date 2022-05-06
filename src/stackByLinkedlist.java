import java.util.EmptyStackException;

public class stackByLinkedlist {
    private listNode top;
    private int length;
    private static class listNode{
        private int data;
        private listNode next;
        public listNode(int data){
            this.data=data;
        }
    }
    public stackByLinkedlist(){
        top=null;
        length=0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void push(int data){
      listNode temp=new listNode(data);
      temp.next=top;
      top=temp;
      length++;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
       int result=top.data;
        top=top.next;
        length--;
        return result;
    }
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }
    public static void main(String[] args) {
        stackByLinkedlist obj=new stackByLinkedlist();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.peek());

    }
}
