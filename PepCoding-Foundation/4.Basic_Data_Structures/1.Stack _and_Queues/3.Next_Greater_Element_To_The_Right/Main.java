class Pepcoding {
    public static int[] NGER(int[] arr) {
        
        Stack<Integer> st = new Stack<>();
        
        int res[] = new int[arr.length];
        res[arr.length - 1] = -1;
        st.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] > st.peek()) {
                st.pop();
            }

            if (st.size() == 0) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }

            st.push(arr[i]);
        }
        return res;
    }
}