public class Easy_26_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length;j++){
            if(nums[j]!=nums[i]){//tim thay so khac dau tien -> Len
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
