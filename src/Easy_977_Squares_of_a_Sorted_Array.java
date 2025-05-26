public class Easy_977_Squares_of_a_Sorted_Array {
     public int[] sortedSquares(int[] nums) {
        int[] sorted = new int[nums.length];
        //If the first element > 0=> Square all elemnt
        if(nums[0]>= 0){
            for(int i = 0; i < nums.length;i++){
                sorted[i] = (int)Math.pow(nums[i],2);

            }
        }
        else{
            //Get Absolute value
            int start = 0;
            int end = nums.length -1;
            int feildindex =  nums.length -1;
            while(feildindex >=0){
                if(Math.abs(nums[start]) > Math.abs(nums[end])){
                    sorted[feildindex] = (int)Math.pow(nums[start],2);
                    start++;
                }else{
                    sorted[feildindex] = (int)Math.pow(nums[end],2);
                    end--;
                }
                feildindex--;
            }
        }
        return sorted;
    }
}
