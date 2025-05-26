public class Easy_1089_Dublicate_Zeros {
    public void duplicateZeros(int[] arr) {
        // đếm xem có bao nhiêu phần tử = 0 được dublicates và mảng sẽ có gía trị nào nằm ở cuối
        // xác định phần tử nằm cuối danh sách
        int posibleDubs = 0;//số lượng phần tử 0 có thể nhân đôi
        int length = arr.length-1;
        // lặp để xác định phần tử sẽ nằm cuối mảng
        //cứ có một phần tử 0 có thể nhân đôi-> Phần tử nằm ở vị trí len - số phần tử 0 sẽ được đẩy về cuối mảng
        for(int left = 0; left <= length - posibleDubs ; left++){
            if(arr[left]==0){
                if (left == length - posibleDubs) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                posibleDubs++;
            }
        }
        int limit = length - posibleDubs;
        //Duyệt ngược về để ghi đè
        //Nếu mà arr[length - posibleDubs] == 0 -> Nhân đôi số 0 ở 2 ô liền kề nhau
        int right = length;
        while(right>=0){
            if(arr[limit] == 0){
                if(right==0){
                    break;
                }
                arr[right]=0;
                arr[right-1] = 0;
                right-=2;
            }
            else{
                arr[right] = arr[limit];
                right--;
            }
            limit--;

        }
    }
}
