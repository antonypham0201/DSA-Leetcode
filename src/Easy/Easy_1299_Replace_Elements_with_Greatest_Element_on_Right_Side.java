package Easy;

public class Easy_1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public int[] replaceElements(int[] arr) {
        int length = arr.length-1;
        int maxSoFar = arr[length];
        arr[length]  = -1;
        for(int i = length - 1; i >= 0 ; i--){
            if(arr[i] > maxSoFar){
                int temp = maxSoFar;
                maxSoFar = arr[i];
                arr[i] = temp;
            }else{
                arr[i] = maxSoFar;
            }
        }
        return arr;
    }
}
