class Solution {
    public static int countSetBit(int n) {

        int count = 0;

        while (n != 0) {

            // method 1 : Shreesh
            int rsbm = (n & (-n));
            n = n - rsbm;
            count++;
            
            //Method 3 : Sp Nain
            // int rsbm = (n & (-n));
            // n = n ^ rsbm;
            // count++;

            //Method 3 : Pep Website Sol
            // n &= (n - 1);
            // count++;

        }

        return count;
    }
    
    public int[] sortByBits(int[] arr) {
        
        // Use any sorting method : I am using bubble sort
        
        int n = arr.length;
        
        for(int itr = 1 ; itr <= n-1 ; itr++){
            for(int j = 0 ; j <= n-itr-1 ; j++){
                
                if( countSetBit(arr[j+1]) < countSetBit(arr[j]) ) { // agle wale me bit kam nikli pichle wale se to swap
                    
                    // swapping the values
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                else if( countSetBit(arr[j+1]) == countSetBit(arr[j]) ){ // agr same nikli
                    
                    if(arr[j+1]<arr[j]){  // to check kro ki agr agle wala number chhota h pichle wale se to swap krdo
                        
                        // swapping the values
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        
        return arr;
    }
}