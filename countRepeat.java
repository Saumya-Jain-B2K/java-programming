public class countRepeat {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 2, 9, 2};
        int target = 2;
        System.out.println(countRepeatElement(arr, target));
    }
    public static int countRepeatElement(int[] arr, int target){
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
