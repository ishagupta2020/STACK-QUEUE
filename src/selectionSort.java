public class selectionSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }


    public void print(int[]arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        selectionSort obj=new selectionSort();
        int[]arr={9,5,2,1,0,7};
        obj.sort(arr);
        obj.print(arr);
    }
}
