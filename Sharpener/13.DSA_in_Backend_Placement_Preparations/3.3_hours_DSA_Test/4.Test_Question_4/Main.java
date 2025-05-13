public static int isDivisible(int num) {

    int missing_number = 0;

    if(num%69 == 0){
        return 0;
    }
    else{
        int rem = num%69;
        return 69-rem;
    }
    
}