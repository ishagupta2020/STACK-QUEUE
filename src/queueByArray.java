public class queueByArray {
    int front;
    int rear;
    int size=3;
    int []arr;

    queueByArray(){
        front=-1;
        rear=-1;
        arr=new int[3];
    }
    public boolean isEmpty(){

        return front == -1;
    }
    public boolean isFull(){

        return rear == size-1;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("queue is full");
        }
        else{
            if(front ==-1){
                arr[front+1] =data;
                front++;
                rear++;
            }
            else{
                arr[rear+1] = data;
                rear++;
            }

        }
    }
    public int dequeue(){
        if(isEmpty()){

            System.out.println("queue is empty");
        }
        int data=arr[front];
        arr[front] = 0;
        front=front+1;


        return data;
    }
    public int first(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        return arr[front];
    }

    public int last(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        return arr[rear];
    }

    public static void main(String[] args) {
        queueByArray obj=new queueByArray();

        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        System.out.println(obj.first());
        System.out.println(obj.last());
    }
}
