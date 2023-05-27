class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        int count = 0; // to stop cyclic replacement after each each element get replaced once
        int i = 0; // to calc new/actual position for element
        int val = nums[0]; // i) first element nikal liya
        int rep = 0;

        while(count<n){
            
            int pos = (i+k)%n; // ii) calc actual position

            // iii) store replace hone wala element and uska index
            int temp = nums[pos];
            i = pos;

            // iv) replace element with val
            nums[pos] = val;
            
            count++; // v) increase count to control loop

            // Edge case : Rep Cyclic Replacement
            if(i == rep){

                i = (i+1)%n; // next element index
                rep = i;     // to stop next rep cyclic replacement
                val = nums[rep]; // value  for next iteration
                continue; // taki value ghadbda na jaaye

            }


            val = temp; // vi) assign temp to val taki next iteration just replaced element pe ho ske
        }
    }
}