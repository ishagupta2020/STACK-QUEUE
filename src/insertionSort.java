public class insertionSort {
    public void sort(int[]arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }
    public void print(int[]arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        insertionSort obj=new insertionSort();
        int[]arr={4,9,8,2,1,6,0};
        obj.sort(arr);
        obj.print(arr);

    }
}
