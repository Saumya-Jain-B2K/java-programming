public class maxArray {
    public static void main(String[] args) {
        int[] arr = {1, 23, 3, 54, 67};
        System.out.println(max(arr)); 
    }
    static int max(int[] arr) {
        int largest = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest; 
    }
}
