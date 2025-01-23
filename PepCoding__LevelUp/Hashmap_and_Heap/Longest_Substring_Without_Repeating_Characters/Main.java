class Solution {
    public int lengthOfLongestSubstring(String s) {

        /*
        // Sp Solution
        HashSet<Character> set = new HashSet<>();
        
        int lsLen = 0;
        String currSS = "";
        
        for (int i = 0; i < s.length(); i++) {
        
            char ch = s.charAt(i);
        
            if (set.contains(ch)) {
        
                if (currSS.length() > lsLen)
                    lsLen = currSS.length();
        
                currSS = ch + "";
                set.clear();
                set.add(ch);
            } else {
                currSS += ch;
                set.add(ch);
            }
        }
        
        // agr longest substring last me end hui to us case me hum for loop me jo if h usme nhi jaa paayenge to us case ke liye yha bhi check kr rkha h e.g. abcabcde
        if(currSS.length() > lsLen) lsLen = currSS.length();
        return lsLen;
        */
        
        // Pep - Solution
        // Step 1 : Create Hashmap to store char and their freq
        HashMap < Character, Integer > map = new HashMap < > ();
        int maxLen = 0;

        int i = -1;
        int j = -1;

        // Step 2 : Iterate over string and find the longest substring without repeating characters
        while (i < s.length() - 1) {
            //aquire
            while (i < s.length() - 1) {
                i++;

                char ch = s.charAt(i);
                int of = map.getOrDefault(ch, 0);
                map.put(ch, of + 1);

                if (map.get(ch) > 1) {
                    break;
                } 
                
                int len = i - j;
                maxLen = Math.max(len, maxLen);
                
            }

            //release
            while (j < i) {
                j++;

                char ch = s.charAt(j);

                if (map.get(ch) == 1) {
                    map.remove(ch);
                } 
                else {
                    int of = map.get(ch);
                    map.put(ch, of - 1);
                    break;
                }
            }
        }

        return maxLen;
    }
}