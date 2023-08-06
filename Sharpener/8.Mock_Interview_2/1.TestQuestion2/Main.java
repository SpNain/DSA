class Solution {
    public int search(int[] arr, int x) {
        int lo = 0;
        int hi = arr.length-1;

        while(lo <= hi){
            int mid = (lo+hi)/2;

            if(arr[mid] == x){
                return mid; // element found
            }else if(x > arr[mid]){
                hi = mid-1;// search area reduces to left
            }else{
                lo = mid+1;// search area reduces to right
            }
        }

        return -1; // element not found
    }
}