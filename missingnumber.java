public class missingnumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            //here we will keep the correct index same as the arr[i] because we are taking the emelents from 0 to N
            int correct = arr[i];
            //now here we will check for two conditions:
            // 1- the element should not be out of the range that is 0 to N-1
            // 2- the element at the index should not be equal to the index
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        //now we will check for the missing element that is the element which is not at the correct index then we will
        //return that element as the missing element
        for(int index = 0; index< arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        //else we will return arrlength
        return arr.length;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
