import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] result = maxFromBothDiagonals(matrix);
        System.out.println(result[0] + " " + result[1]);
        sc.close();
    }
    

//========== User's Code Starts Here ==========

    public static int[] maxFromBothDiagonals(int[][] matrix) {
        
        int[] res = {matrix[0][0],matrix[matrix.length-1][0]};
        
        for(int i = 0; i<matrix.length; i++){
            if(matrix[i][i] > res[0]){
                res[0] = matrix[i][i];
            }
            
            if(matrix[matrix.length-1-i][i] > res[1]){
                res[1] = matrix[matrix.length-1-i][i];
            }
        }
        
        return res;
    }
    
//========== User's Code Ends Here ==========


}