public class findduplicate {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            // first we will see if the emelent that is at the 0th index is equal to the index + 1 value
            if(nums[i] != i + 1){
                //then we will apply cycle sort
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i , correct);
                }
                else {
                    //we know that the element is duplicated thats why it is getting cgeked again
                    return nums[i];
                }
            } 
            else{
                i++;
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
