class Solution {
    public boolean isValid(String exp) {

        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < exp.length() ; i++){
            char ch = exp.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                st.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){

                if(st.size() == 0){
                    return false;  // nCB > nOB
                }
                if((ch == ')' && st.peek() != '(') || (ch == '}' && st.peek() != '{') || (ch == ']' && st.peek() != '[')){
                    return false; // brackets mismatch
                }

                st.pop();
            }
        }
        if(st.size() > 0){
            return false;  // nOB > nCB
        }
        return true;
    }
}