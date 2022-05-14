public class bubbleSort {
    public void sort(int[]arr){
        boolean isSwapped;
        for(int i=0;i<arr.length-1;i++){
            isSwapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped=false){
                break;
            }
        }
    }
    public void print(int[]arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        bubbleSort obj=new bubbleSort();
        int[]arr={7,4,2,6,0};
        obj.sort(arr);
        obj.print(arr);

    }
}
