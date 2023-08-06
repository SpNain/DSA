class Pepcoding {
    public static boolean isDuplicate(String exp) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == ')') {
                if (st.peek() == '(') {
                    return true;
                }

                while (st.peek() != '(') {
                    st.pop();
                }

                st.pop(); // for opening bracket
            } else {
                st.push(ch);
            }
        }

        return false;
    }
}