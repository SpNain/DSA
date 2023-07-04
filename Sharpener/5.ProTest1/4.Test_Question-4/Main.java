class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        if(s1.equals(s2)){
            return true;
        }
        
        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();
        
        
        int count = 0;
        int idx1 = 0;
        int idx2 = 0;
        
        for(int i = 0 ; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                if(count == 0) {
                    idx1 = i;
                    count++;
                }
                else if(count == 1){
                    idx2 = i;
                    count++;
                }
                else{
                    count++;
                }
                
            }
        }

        if(count==2){
            if(str1.charAt(idx1) == str2.charAt(idx2) && str1.charAt(idx2) == str2.charAt(idx1)){
                return true;
            }
        }
        
        return false;
    }
}