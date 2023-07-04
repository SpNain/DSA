class Solution {
    public boolean hasAlternatingBits(int n) {

        /* approach 1 : Sharpener
        while(n>0){
            int prev = n&1;
            int curr = (n>>1)&1;
            
            if((prev ^ curr) == 0){ // because in XOR if bits are same then resultant bit will be 0
                return false;
            }
            n=(n>>1);
        }
        return true;
        */

        // approach 2 : Leetcode & YT
        int x = n ^ (n>>1);
        return (x & x+1) == 0;
    }
}