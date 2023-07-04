class Solution {
    public int maximumWealth(int[][] arr) {
        int totalWealth = Integer.MIN_VALUE;
        
        for(int i = 0; i< arr.length; i++){
            int wealth = 0;
            for(int j = 0; j<arr[0].length; j++){
                wealth += arr[i][j];
            }
            if(wealth > totalWealth){
                totalWealth = wealth;
            }
        }
        
        return totalWealth;
    }
}