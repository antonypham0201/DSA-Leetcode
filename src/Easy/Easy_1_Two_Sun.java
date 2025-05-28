package Easy;
import java.util.Arrays;
public class Easy_1_Two_Sun {
    public int[] twoSum(int[] nums, int target) {
        //luu cac  chi so cua nums va cac gia tri theo trat tu goc truoc khi sort
        int[][] arrWithIndex = new int[nums.length][2];
        //So hang bang voi kich co cua nums, tung hang se luu gia tri va chi so tuong ung cua mang nums goc
        for(int i = 0; i < nums.length; i++){
            arrWithIndex[i][0] = nums[i];//Gia tri goc
            arrWithIndex[i][1] = i;//Chi so goc
        }
        //Sort ArrWithIndex theo gia tri (nums[i])
        Arrays.sort(arrWithIndex,(a,b)->Integer.compare(a[0],b[0]));
        //2 pointers
        int left = 0 ; int right = nums.length -1;
        while( left < right){
            int sum = arrWithIndex[left][0] + arrWithIndex[right][0];
            if ( sum == target){
                return new int[] {arrWithIndex[left][1], arrWithIndex[right][1]};
            }else if ( sum < target){
                left++;
            }else{
                right--;
            }
        }
        //Khong tim thay cap chi so co gia tri thoa man de bai
        return new int[] {-1, -1};
    }
}
