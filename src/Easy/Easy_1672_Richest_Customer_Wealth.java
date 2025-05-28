package Easy;

public class Easy_1672_Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int rows = accounts.length;
        int cols = accounts[0].length;
        for(int i = 0 ; i < rows;i++ ){
            int per_wealth = 0;
            for(int j = 0 ; j < cols; j++){
                per_wealth+= accounts[i][j];
            }
            max = Math.max(max,per_wealth);
        }
        return max;
    }
}
