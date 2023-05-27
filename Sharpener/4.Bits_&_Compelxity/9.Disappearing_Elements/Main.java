import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public List<Integer> missing_elements(int[] nums) {
        
        /*
       // Sp Solution : Time Complexity : O(n^2) & Space Complexity : O(1)
        int n = nums.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // kyunki arr me sirf 1 to n hi elements h to hum 1 to n tk loop chlake har ek element ke liye check krenge ki wo h ki nhi array me
        for (int i = 1; i <= n; i++) { // here i will represent element in the array
            int count = 0;
            for (int j = 0; j < n; j++) { // pure array pe loop maarke check krenge ki kya usme i h agr h to count ko ++ krdo
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 0) { // agr kisi element ke liye count 0 h means ki wo array me nhi h to use list me add krdo
                list.add(i);
            }
        }
        */
        /*
        //Sharpener : Vaibhav Solution : Time Complexity : O(n) & Space Complexity : O(n)
        // yhape hum ek extra array bnate h aur us extra resultant array me given array ki values ka use krke unki shi positions nikalte h aur res array me us pos par us val ko rkhwa dete h
        // jaise ki if nums = {4,3,2,7,8,2,3,1} then res = {1,2,3,4,0,0,7,8}
        // to last me jis index par 0 hoga means ki us index par koi value assign nhi hui means wo values missing h
        // wo values kaise niklegi - kyunki 0 index pe 1 h aur 1 pe 2 to isi hisab se missing value hogi index+1
        
        int n = nums.length;
        
        int[] res = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<n; i++){
            int val = nums[i];
            int pos = val - 1;
            res[pos] = val;
        }
        
        for(int idx = 0; idx<n; idx++){
            if(res[idx] == 0)
                list.add(idx+1);
        }
        */
        
        //Sharpener : Vaibhav Solution : Time Complexity : O(n) & Space Complexity : O(1)
        // humne yhape same rotate array wali approach apnai h
        // bas yha pe hum saare numbers ko unke shi place pe swap krwa rhe h like 1 should be on 0 index, 2 on 1 etc.
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int val = nums[0];
        
        // yhape hum count ki bjay i se isiliye loop control kr rhe h kyunki abki baar hume swapping se frk nhi pdta ki kitni ho rhi h balki frk isse pdta h ki kya har ek jgah pe jis element ko hona chahiye tha wo udhar h ki nhi 
        // to i hum sirf tabhi bdate h jb jis index pe hume value replace krni h whape pahle se shi value pdi ho
        // to iss trike se i sirf tabhi out of index jaayega jb array me jo jo element present h wo saare apni shi jgah pe honge
        while (i < n) {
        
            // to yhape pos bhi usi hisab se nikali jaayegi na val-1 krke kyunki agr element 4 h to uski position 3 hogi
            int pos = val - 1;
        
            int temp = nums[pos];
        
            // aur yhape edge case jo h wo index pe nhi balki value pe h 
            // means ki val yani jo element swap krna h aur temp yani jo element swap hoga dono same hue 
            // to fir us case me hmara rep cyclic replacement occur ho jaayega
            // to iss case me hum i ko increase krte h new val nikalte h
            // aur count ko ++ krte h kyunki beshak values swap nhi hui but values process to ho hi gyi na
            if (temp == val) {
        
                i++;
                if(i==n) break;
                val = nums[i];
                continue;
            }
        
            nums[pos] = val;
        
            val = temp;

        }
        
        // agr saare element apni shi position pe aa gye honge 
        // to jis index pe us index ke hisab se shi element nhi hoga that means ki wo number disappear h aaray se
        for(int idx = 0; idx<n; idx++){
            if(nums[idx] != idx+1)
                list.add(idx+1);
        }
        
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
        String n =sc.nextLine();
        Solution s = new Solution();
        String s_arr[]=n.split(" ");
        int arr[]=new int[s_arr.length];
        for(int i=0;i<s_arr.length;i++)
        {
            arr[i]=Integer.parseInt(s_arr[i]);
        }
        
        List<Integer> max= s.missing_elements(arr);
        Collections.sort(max);
        for(int i:max)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}