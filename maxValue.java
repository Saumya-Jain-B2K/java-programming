public class maxValue {
    public static void main(String[] args) {
        int [] arr = {12, 45, 7, 89, 34};
        System.out.println(maxElement(arr));
    }
    public static int maxElement(int[]arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
