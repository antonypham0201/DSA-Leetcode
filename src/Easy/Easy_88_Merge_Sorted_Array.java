package Easy;

public class Easy_88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = nums1.length-1;
        while (i >= 0 && j >=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        //Trong truong hop j chen chua het vao mang
        if(j>=0){
            for (int l = k; l>=0 ; l--) {
                nums1[l] = nums2[j];
                j--;
            }
        }
    }
}
