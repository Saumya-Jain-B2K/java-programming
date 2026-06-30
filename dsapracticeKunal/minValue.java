public class minValue {

    public static void main(String[] args) {
        int[] arr = {23, 56, 34, 11, 3};
        System.out.println(minElement(arr));
    }
    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
