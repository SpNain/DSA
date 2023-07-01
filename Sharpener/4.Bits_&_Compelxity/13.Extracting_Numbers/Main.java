import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public List<Integer> extract_number(String s) {
        
        ArrayList<Integer> list = new ArrayList<>();

        // Approach Stage 1
        
        boolean flag = true;
        
        int num = 0;
        
        for (int i = 0; i < s.length(); i++) { // we will traverse the string

            // agr char 0-9 h aur flag true h to use number me add krdo
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && flag) {
                num = num * 10 + ((int) (s.charAt(i)) - 48);
            }

            // 1st condition isiliye h taki index out of bond ka exception na aa jaaye kyunki jb hum last index pe honge to us case me next char hoga ki nhi
            // agr aage wala char bhi 0-9 h to flag ko true rkho
            if (i + 1 < s.length() && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') {
                flag = true;
            }

            // agr next wala char 0-9 nhi h to ab tk ka formed num list me add krdo aur next number ke liye var reset krdo
            else {
                // agr hmara no. 0 hua that means ko koi number form nhi hua h
                // agr 0 nhi hua to that means ki num form hua h use list me add krdo
                if(num != 0) list.add(num);

                // ab hmara formed number to add ho chuka h aur hum else me isiliye aaye h kyunki agla char 0-9 nhi h
                // to number ko reset yani 0 krdo dobara se 
                // aur flag ko false krdo
                num = 0;
                flag = false;
            }
        }
        

        /* Approach Stage 2
        // Iss aproach me maine count ko add kra h aur flag ko htaya h
        // count -- kyunki agr bich me 0 aaya to num to tb bhi 0 hi rhega to us case me bhi to num add hona chahiye
        //          isiliye new var count le liya jisse num form hua h ki nhi uska hisab rkhenge
        // flag -- kyunki maine dhyan se dekha to flag ka koi real usage tha hi nhi
        
        int num = 0, count = 0;
        
        for (int i = 0; i < s.length(); i++) {
        
            // agr char 0-9 h to use number me add krdo
            // aur count ko increase krdo jisse list me add krte time iss baat ka pta lga ske ki num form hua h ki nhi
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num = num * 10 + ((int) (s.charAt(i)) - 48);
                count++;
            }
        
            // agr aage wala char bhi 0-9 h to kuch mat kro
            if (i + 1 < s.length() && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') {
            }
        
            else {
                // suru me maine num wali condtion lga rkhi thi ki agr num 0 nhi h to num ko list me add krdo
                // but agr kahi string ke bich me sirf 0 aa jaaye joki 0-9 to h but hmara number form hone ke baad bhi 0 hi h
                // to us case me hamri niche wali condition ke hisab se wo num list me add nhi hoga
                // isiliye maine count bnaya ki agr count 0 nhi h to that means num form hua h beshak num 0 hi kyu na bna, ho num list me add hoga
                if (count != 0)
                    list.add(num);
                
                // count ko 0 krdo jisse next number jb form ho tabhi list me addition hoye
                num = 0;
                count = 0;
            }
        }
        
        // Approach Stage 3
        // ye bhi same stag 2 ke jaise hi h bas isme num hume string liya h
        
        String num = "";
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
        
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num += s.charAt(i);
                count++;
            }
        
            if (i + 1 < s.length() && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') {  }
        
            else {
                // list kyunki integer type h to usse pahle parseInt ka use krke int me convert krlo fir list me add krdo
                if (count != 0)
                    list.add(Integer.parseInt(num));
        
                // num ko dobara se empty string assign krdo
                num = "";
                count = 0;
            }
        }
        */
        return list;
    }
}

//========== User's Code Ends Here ==========


public class Main
{
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String y=sc.nextLine();
        Solution s = new Solution();
        List<Integer> max= s.extract_number(y);
        for(int i:max)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}