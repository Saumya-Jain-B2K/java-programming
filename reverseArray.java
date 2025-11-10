public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // System.out.println(reverse(arr));
        int[] reversed = reverse(arr);

        // Print the reversed array
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }

    static int[] reverse(int[] arr) {
        int[] newArr = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1; i>=0; i-- ){
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }
}
