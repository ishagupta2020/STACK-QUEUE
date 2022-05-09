import java.util.NoSuchElementException;

public class queueByLinkedList {
    private listNode rear;
    private listNode front;
    private int length;
    private class listNode {
        private int data;
        private listNode next;

        public listNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public queueByLinkedList(){
      this.front=null;
      this.rear=null;
      this.length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void print() {
        if (isEmpty()){
            return;
        }
        listNode current=front;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }


    public void enqueue(int data){
        listNode node=new listNode(data);
        if(isEmpty()){
            front=node;
        }
        else{
            rear.next=node;
        }
        rear=node;
        length++;
    }
    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        length--;
        return result;
    }
    public static void main(String[] args) {
        queueByLinkedList obj=new queueByLinkedList();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.dequeue();
        obj.print();
    }
}
