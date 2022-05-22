public class quickSort {
    public int partition(int[]arr,int low,int high){
        int pivot=arr[high];
        int i=low;
        int j=low;
        while(i<=high){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
    public void sort(int[]arr,int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            sort(arr,low,p-1);
            sort(arr,p+1,high);
        }
    }
    public void printArray(int[]arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[]arr={5,6,2,9,0,4};
        quickSort obj=new quickSort();
        obj.sort(arr,0,arr.length-1);
        obj.printArray(arr);
    }
}
