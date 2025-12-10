import java.util.ArrayList;
import java.util.List;

public class findallmissing {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i< nums.length){
            int correct = nums[i] - 1; //because the range is from 1 to N
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        //now the second condidtion arrives that we have to get those numbers in the list that are missing
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index<nums.length; index++){
            if(nums[index] != index + 1){
                // adding the index value in the answer
                ans.add(index + 1);
            }
        }
        return ans;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
