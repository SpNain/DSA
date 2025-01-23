class Solution {
    public int countPrimes(int n) {
        
        // Step 1 : Created a new arr of size n+1 and mark all indexes with true
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);

        // Step 2 : Mark non prime indexes false
        for (int idx = 2; idx * idx <= n; idx++) {
            if (arr[idx] == true) {
                for (int i = 2 * idx; i <= n; i += idx) {
                    arr[i] = false;
                }
            }
        }

        // Step 3 : Find all primes upto n
        int count = 0;
        for (int idx = 2; idx < n; idx++) {
            if (arr[idx] == true) {
                count++;
            }
        }
        
        return count;

    }
}