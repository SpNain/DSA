class Solution {
    public int divide(int dividend, int divisor) {

        // Step 0 : Handling Edge Cases
        // Way 1 
        // // Case 1 : quotient is greater than(in first two conditions) or equal to (in 3rd condition) Integer.MAX_VALUE
        // if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1) || (dividend == Integer.MAX_VALUE && divisor == 1)) {
        //     return Integer.MAX_VALUE;
        // }
        // // Case 2 : quotient is equal to Integer.MIN_VAULE
        // else if((dividend == Integer.MIN_VALUE && divisor == 1)){
        //     return Integer.MIN_VALUE;
        // }
        // // Case 3 : divisor is 1 or -1
        // else if(divisor == 1 || divisor == -1){
        //     return divisor == 1 ? dividend : - dividend;
        // }

        // Way 2 
        // In the Way 1 we are handling edge cases which are not required but we are handling them so that we don't need to do some extra work for some special cases
        // In the given question we have to handle edge cases for only when quotient is greater than max value or less than min value
        // so if we reduce our handling edge cases to only provided ones then above code will reduce to below code
        // so we have truncated the cases when quotient is equal to max or min value and divisor is 1 or -1 because for these cases our code will work fine
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }


        // Step 1 : Calc the Sign of result
        int sign = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0) ? -1 : 1;

        
        // Step 2 : Calc quotient
        int quotient = 0;

        // Take the absolute value
        // we have converted dividend and divisor into long kyunki baaki saare cases me to int shi chlega but agr dividend or divisor me se koi bhi Integer.MIN_VALUE hua to us case me inka absolute hoga 2^31 but int can only store upto 2^31-1
        // aur hum inn cases ko edge cases me bhi handle nhi kr skte kyunki 
        // agr maanlo dividend min value h to uske liye divisor kuch bhi ho skta h aur divisor kya h uske hisab se quotient aayega hmara
        // same for divisor agr min value h to dividend kuch bhi ho skta h aur dividend kya h uspe depend krta h ki quotient kya aayega hmara
        // isiliye hume inhe long me hi convert krke store krna pdega
        // bas ek trika h ki hum dividend ya divisor jo bhi min value ho usme +1 krde jisse ki number abs honepe int ki range me rhe
        long absDividend = Math.abs((long)dividend);
        long absDivisor = Math.abs((long)divisor);

        
        // Method 1 : BRUTE FORCE APPROACH
        // while (absDividend >= absDivisor) { // Loop until the  dividend is greater than divisor

        //     absDividend -= absDivisor;
        //     quotient++;

        // }


        // Method 2 : OPTIMIZED APPROACH - USING BITS
        while (absDividend >= absDivisor) { // Loop until the  dividend is greater than divisor

            // This represents the number of bits shifted or how many times we can double the number
            int shift = 0;

            // agr hum divisor ko long me convert nhi krte the hume idhar (absDivisor<<shift)>0 condition aur lgani pdti due to cyclic behavior of number system
            while (absDividend >= (absDivisor << shift)) {
                shift++;
            }

            // Add the number of times we shifted to the quotient
            quotient += (1 << (shift - 1));
 
            // Update the dividend for the next iteration
            absDividend -= absDivisor << (shift - 1);

        }

        return sign == -1 ? -quotient : quotient;
    }
}