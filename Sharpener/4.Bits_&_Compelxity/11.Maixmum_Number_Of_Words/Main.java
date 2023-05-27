class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxWordCount = 0;
        
        for(int i = 0 ; i < sentences.length; i++){  // array of string ko traverse kra
            String oneSentence = sentences[i];       // ek array nikala
            
            int wordCount = 1;                       // first wale word ko suru me hi count kr liya 
            
            for(int j = 0; j < oneSentence.length(); j++){
                if(oneSentence.charAt(j) == ' '){    // ab jitne bhi spaces honge sentence me utne hi words honge
                    wordCount++;
                }
            }
            
            if(wordCount > maxWordCount){           // agr curr sentence me prev sentence se jyada words h to maxWordCount ko update krdo
                maxWordCount = wordCount;
            }
        }
        
        return maxWordCount;                        // last me maxWordCount ko return krdo
    }
}

//========== User's Code Ends Here ==========



public class Main
{
   
    
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        Solution s = new Solution();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        int output = s.mostWordsFound(arr);
        
        System.out.println(output);
    }
}