class Solution {
    public int missingNumber(int[] nums) {
         int n = nums.length;  // yhape array me numbers 0 to n h means ki agr array ki length 3 h to array me 0-3 hi element honge aur 3 elements honge
        
        // to hum 0-3 tk ke numbers ka sum nikal lenge
        int sum = n*(n+1)/2;
        
        // aur arr ke ele ka sum nikal lenge
        int sumOfArr = 0;
        
        for(int i = 0; i<nums.length; i++){
            sumOfArr += nums[i];
        }
        
        // ab unme jitne ka difference hoga whi hmara missing number hoga
        int missingNumber = sum - sumOfArr;
        
        return missingNumber;
    }

    //Function to swap two elements
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}