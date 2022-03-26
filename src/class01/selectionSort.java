package class01;

public class selectionSort {

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {//i~N-1
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }
    public static void swap ( int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main (String[]args){
        int[] arr={56,46473,1,0,46,12};
        selectSort(arr);
        System.out.println("--------");
        System.out.println(arr);
        for(Integer i:arr){
            System.out.println(i);
        }
        System.out.println("--------");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

