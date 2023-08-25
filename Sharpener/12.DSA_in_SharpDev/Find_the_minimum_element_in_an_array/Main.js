var findminimumnumber = (arr) => {
        
    //Write your code here
    //return the minimum number present in the array
    
    let min = arr[0];
    for(let i = arr.length-1; i>=0; i--){
        min = arr[i] < min ? arr[i] : min;
    }
    
    return min;

}