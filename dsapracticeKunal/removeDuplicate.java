public class removeDuplicate {
    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; 
        int k = new removeDuplicate().removeDuplicates(nums);
        System.out.println(k);
        // for (int i = 0; i < k; i++){
        //     // System.out.print(nums[i] + " ");
        //     for (int j = 0; j < nums.length-1; j++){
        //         if (nums[j] == nums[j+1]){
        //             continue;
        //         }
        //         else {
        //             System.out.print(nums[i] + " ");
        //         }
        //     }
        // }

        if (k > 0) {
            System.out.print(nums[0] + " ");
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i-1]) {
                    System.out.print(nums[i] + " ");
                }
            }
        }
    }

    public static int removeDuplicates(int[] nums) {
        int del = 0;
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                del++;
            }
        }
        return nums.length - del;
    }

}

