package Easy;

public class Easy_905_Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int left  = 0;
        int right = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[left++] = num;
            } else {
                result[right--] = num;
            }
        }
        return result;
    }
}
