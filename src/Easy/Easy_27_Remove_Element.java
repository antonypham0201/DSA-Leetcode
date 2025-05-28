package Easy;

public class Easy_27_Remove_Element {
    public int removeElement(int[] nums, int val) {
        int k = 0;//số số hạng trong mảng khác với val
        int j = 0; // con trỏ ở vị trí nums[j] !=val
        for(int i = 0; i < nums.length;i++){
            if(nums[i] != val){
                nums[j++] = nums[i];
                k++;
            }
        }
        return k;
    }
}
