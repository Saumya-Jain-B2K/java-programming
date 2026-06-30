public class duplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] num){
        int start = 0;
        int end = num.length - 1;
        for (int i = start; i < end; i++){
            for (int j = i+1; j<num.length; j++){
                if (num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
