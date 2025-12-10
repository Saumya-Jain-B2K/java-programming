import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cycleSort(int[] arr){
        // initialise i with 0
        int i = 0;

        // we will run the while loop
        while(i < arr.length){
            //we will initialise the correct index value
            int correct = arr[i] - 1;
            //checkign for the correct condition that if the emelent is at the correct index or not
            if(arr[i] != arr[correct]){
                swap(arr, i,correct);
            }
            else{
                //increase the pointer only when the element is already sorted in the array
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
