import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int last = arr.length - i - 1;
            // finding the max index of the max element
            int maxIndex = getMaxIndex(arr, 0, last);
            // now using that swap in the array
            swap(arr, maxIndex, last);
        }
    }

    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
