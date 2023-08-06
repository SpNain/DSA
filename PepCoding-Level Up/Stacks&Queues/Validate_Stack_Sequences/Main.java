// Pep Solution

import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        int i = 0;
        int j = 0;

        Stack<Integer>st = new Stack<>();
        
        while(j < popped.length) {
            if(st.size() > 0 && popped[j] == st.peek()) {
                st.pop();
                j++;
            }
            else if(i < n){
                st.push(pushed[i]);
                i++;
            }
            else {
                return false;
            }
        }
        
        return st.isEmpty();
    }
}

/*
// My Solution
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> st = new Stack<>();

        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            st.push(pushed[i]);
            while (!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }

        return st.isEmpty() ? true : false;
    }
}

// Hum pushed wale arr pe loop maarenge
// aur har ek value ko push krne ke baad check krenge ki kya popped wale arr ke sequence me kuch element pop kiye jaa skte h kya
// to jitne element pop ho skte h unhe pop kr dete h
// ab agr saare element pop ho gye to true wrna false return krdo
*/