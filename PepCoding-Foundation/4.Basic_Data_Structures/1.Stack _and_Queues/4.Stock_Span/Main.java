class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int arr[], int n)
    {

        Stack<Integer> st = new Stack<>();
        
        int res[] = new int[arr.length];
        res[0] = -1;
        st.push(0);

        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }

            st.push(i);
        }
        
        for(int i = 0; i<res.length; i++){
            res[i] = i-res[i];
        }
        
        return res;
    }
    
}