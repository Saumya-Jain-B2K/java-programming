import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int arr[]){
        //first loop
        for(int i = 0; i<arr.length - 1; i++){
            // letting a variable
            boolean swapped = false;
            for(int j = 1; j<arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    //also initialising the swapped value as true because swapping has been performend
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
