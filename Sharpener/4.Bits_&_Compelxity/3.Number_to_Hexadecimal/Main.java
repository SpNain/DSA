class Solution {
    public String toHex(int num) {

        // // Sp : Method 1

        // // Step 0 : handling two edge cases
        // if(num == 0){
        //     return "0";
        // }
        // // else if (num == -(Math.pow(2,31))){ // Way 1
        // //     return "80000000";
        // // }
        // else if (num == -2147483648){ // way 2
        //     return "80000000";
        // }

        // // Step 1 : Calc hexadecimal digit values for absolute value of given number
        // int pNum = Math.abs(num);  // making number +ve by taking absolute

        // // storing remainders in an array for further operations
        // int[] arr = new int[8]; // size 8 because hexadecimal number have atmost 8 bits
        // int i = 7;   // i = 7 because size is 8 so indexing will be 0 to 7
                        // aur kyunki digits last se nikalana start krenge isiliye arr bhi last se fill up krenge
        // while (pNum>0){

        //     int rem = pNum%16;
        //     pNum /= 16;

        //     arr[i] = rem; // rem ko arr me store krwa liya kyunki char pe operator kaam nhi krte
        //     i--;
        // }

        // // Step 2 : if num is -ve then we have to perform 16's complement (15's complement + add 1)
        // if(num<0){

        //     // 15's complement
        //     for(int idx = 7; idx>=0; idx--)
        //         arr[idx] = 15 - arr[idx];

        //     // adding 1
        //     int carry = 1;
        //     for(int idx = 7; idx>=0; idx--){

        //         if(carry == 0) break; // agr kabhi bhi carry 0 ho gya means ki ab aage numbers ko check krne ki jrurat nhi h wo saare 16 se kam hi honge

        //         arr[idx] += carry;

        //         // Way 1
        //         // if(arr[idx] == 16){
        //         //      arr[idx] = 0;
        //         //      carry = 1;
        //         // }
        //         // else{
        //         //      carry = 0;
        //         // }

        //         // Way 2
        //         int temp = arr[idx];    // kyunki agr arr[idx] ko store nhi krwaya to
        //         arr[idx] = arr[idx]%16; // arr[idx] iss line me change ho jaayega
        //         carry = temp/16;        // to fir carry ko kaise nikalenge
        //     }                
        // }

        // // Step 3 : truncating extra 0's
        // int nzIdx = 0;
        // while(nzIdx<8 && arr[nzIdx] == 0){ // agr condition 1 ko baad me likha to arr: index out of bound exception aa skta h
        //     nzIdx++;   
        // }

        // // Step 4 : preparing answer
        // String ans = "";

        // // Way 1
        // // for(int idx = 7; idx>=nzIdx; idx--){
        // //     if(arr[idx]>9)
        // //         ans = (char)(arr[idx]+87) + ans;
        // //     else 
        // //         ans = arr[idx] + ans;
        // // }

        // // Way 2
        // for(int idx = nzIdx; idx<8; idx++){
        //     if(arr[idx]>9)
        //         ans = ans + (char)(arr[idx]+87);
        //     else 
        //         ans = ans + arr[idx];
        // }

        // return ans;

        //-------------------------------------------------------------------------------------------//

        // Sp : Method 2

        // Step 0 : handling two edge cases
        if (num == 0) {
            return "0";
        } else if (num == -(Math.pow(2, 31))) { // Way 1
            return "80000000";
        }
        // else if (num == -2147483648){ // way 2
        //     return "80000000";
        // }

        // Step 1 : Calc hexadecimal digit values for absolute value of given number && preparing answer for +ve numbers

        int pNum = Math.abs(num); // making number +ve by taking absolute

        // storing remainders in an array for further operations
        int[] arr = new int[8]; // size 8 because hexadecimal number have atmost 8 bits
        int i = 7; // i = 7 because size is 8 so indexing will be 0 to 7
                        // aur kyunki digits last se nikalana start krenge isiliye arr bhi last se fill up krenge

        String ans = "";

        while (pNum > 0) {

            int rem = pNum % 16;
            pNum /= 16;

            if (num < 0) {
                arr[i] = rem; // rem ko arr me store krwa liya kyunki char pe operator kaam nhi krte
                i--;
            }
            // preparing ans if num is +ve
            else {
                if (rem > 9) {
                    ans = (char) (rem + 87) + ans;
                } else {
                    ans = rem + ans;
                }
            }
        }

        // Step 2 : if num is -ve then we have to perform 16's complement (15's complement + add 1)

        if (num < 0) {

            // 15's complement
            for (int idx = 7; idx >= 0; idx--)
                arr[idx] = 15 - arr[idx];

            // adding 1
            int carry = 1;
            for (int idx = 7; idx >= 0; idx--) {

                if (carry == 0)
                    break; // agr kabhi bhi carry 0 ho gya means ki ab aage numbers ko check krne ki jrurat nhi h wo saare 16 se kam ho honge

                arr[idx] += carry;

                // Way 1
                if (arr[idx] == 16) {
                    arr[idx] = 0;
                    carry = 1;
                } else {
                    carry = 0;
                }

                // Way 2
                // int temp = arr[idx];    // kyunki agr arr[idx] ko store nhi krwaya to
                // arr[idx] = arr[idx]%16; // arr[idx] iss line me change ho jaayega
                // carry = temp/16;        // to fir carry ko kaise nikalenge
            }
        }

        // Step 3 : truncating extra 0's
        // we don't need to truncate 0's in this method because extra 0s sirf tbhi aati h jb num +ve ho aur +ve number ke liye humne pahle se hi answer prepare kr liya h aur -ve numbers me aage extra 0s nhi hote kyunki har ek -ve hexadecimal numbers ki leftmost 1st digit 'f' hoti h (jaise binary me har -ve binary number ki leftmost 1st digit 1 hoti h)

        // Step 4 : preparing answer for -ve num
        if (num < 0) {
            // Way 1
            // for(int idx = 7; idx>=0; idx--){
            //      if(arr[idx]>9)
            //         ans = (char)(arr[idx]+87) + ans;
            //     else 
            //         ans = arr[idx] + ans;
            // }

            // Way 2
            for (int idx = 0; idx < 8; idx++) {
                if (arr[idx] > 9)
                    ans = ans + (char) (arr[idx] + 87);
                else
                    ans = ans + arr[idx];
            }
        }

        return ans;
    }
}

// Sharpener -- Vaibhav Code
class Solution {
    public String toHex(int num) {
        int a[] = new int[8];
        int i = 7;
        int temp = Math.abs(num);

        while (temp > 0) {
            a[i] = temp % 16;
            i = i - 1;
            temp = temp / 16;
        }

        if (num < 0) {

            for (int idx = 0; idx <= 7; idx++) {
                a[idx] = 15 - a[idx];
            }

            int c = 1;
            i = 7;

            while (i >= 0) {
                if (a[i] + c < 16) {
                    a[i] = a[i] + c;
                    break;
                }
                temp = a[i];
                a[i] = (a[i] + c) % 16;
                c = (temp + c) / 16;
                i = i - 1;
            }
        }

        i = 0;
        while (i < 8 && a[i] == 0) {
            i = i + 1;
        }

        String ans = "";
        for (int j = i; j <= 7; j++) {
            if (a[j] <= 9) {
                ans = ans + a[j];
            } else if (a[j] == 10) {
                ans = ans + 'a';
            } else if (a[j] == 11) {
                ans = ans + 'b';
            } else if (a[j] == 12) {
                ans = ans + 'c';
            } else if (a[j] == 13) {
                ans = ans + 'd';
            } else if (a[j] == 14) {
                ans = ans + 'e';
            } else if (a[j] == 15) {
                ans = ans + 'f';
            }
        }
        return ans;
    }
}