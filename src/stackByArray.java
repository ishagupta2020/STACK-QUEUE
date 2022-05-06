public class stackByArray {
    int[]arr;
    int top;
    int capacity;
    public stackByArray(int capacity){
        this.capacity=capacity;
        top=-1;
        arr=new int[capacity];
    }
    public void push(int data){
        if(top==capacity-1){
            System.out.println("overflow");
        }
        top++;
        arr[top]=data;
    }
    public int pop(){
        if(top==-1){
            System.out.println("underflow");
        }
        int res=arr[top];
        top--;
        return res;
    }
    public int peek(){
        if(top==-1){
            System.out.println("underflow");
        }
        return arr[top];
    }

    public static void main(String[] args) {
        stackByArray obj=new stackByArray(5);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.peek());







    }
}

