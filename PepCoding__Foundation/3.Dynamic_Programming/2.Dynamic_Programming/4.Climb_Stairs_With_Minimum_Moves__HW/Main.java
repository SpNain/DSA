// // Jha ka code
// import java.io.*;
// import java.util.*;

// public class Main {

//    public static void main(String[] args) throws Exception {
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       int n = Integer.parseInt(br.readLine());
//       int[] arr = new int[n];
//       for (int i = 0; i < arr.length; i++) {
//          arr[i] = Integer.parseInt(br.readLine());
//       }

//       Integer[] dp = new Integer[n + 1];
//       dp[n] = 0;

//       for (int i = n - 1; i >= 0; i--) {
//          if (arr[i] > 0) {
//             int min = Integer.MAX_VALUE;

//             for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
//                if(dp[i + j] != null){
//                   min = Math.min(min, dp[i + j]);
//                }
//             }

//             if(min != Integer.MAX_VALUE){
//                dp[i] = min + 1;
//             }
//          }
//       }

//       System.out.println(dp[0]);
//    }

// }



// // Sp Nain : 6.7 
// import java.io.*;
// import java.util.*;

// public class Main {

//    public static void main(String[] args){
//       Scanner scn = new Scanner(System.in);
//       int n = scn.nextInt();
//       int[] moves = new int[n];
//       for (int i = 0; i < moves.length; i++) {
//          moves[i] = scn.nextInt();
//       }
//       int[] dp = new int[n+1];
      
//       for(int i = n; i>=0; i--){
//           if(i==n){
//               dp[i]=0;
//           }
//           else{
//               int maxjmps = moves[i];
//               int min = Integer.MAX_VALUE;
//               for(int j = 1; j<=maxjmps && maxjmps+i<=n; j++){
//                   min = Math.min(dp[i+j],min);
//               }
//               if(min==Integer.MAX_VALUE){
//                   dp[i] = min;
//               }
//               else{
//                   dp[i] = min+1;
//               }
//           }
//       }
//       System.out.println(dp[0]);
//    }
// }


// // Sp Nain
// import java.io.*;
// import java.util.*;

// public class Main {

//    public static void main(String[] args){
//       Scanner scn = new Scanner(System.in);
//       int n = scn.nextInt();
//       int[] moves = new int[n];
//       for (int i = 0; i < moves.length; i++) {
//          moves[i] = scn.nextInt();
//       }
//       int[] dp = new int[n+1];
      
//       for(int i = n; i>=0; i--){
//           if(i==n){
//               dp[i]=0;
//           }
//           else{
//               int maxjmps = moves[i];
//               int min = Integer.MAX_VALUE;
//               for(int j = 1; j<=maxjmps && i+j<=n; j++){
//                   min = Math.min(dp[i+j],min);
//               }
//               if(min==Integer.MAX_VALUE){
//                   dp[i] = min;
//               }
//               else{
//                   dp[i] = min+1;
//               }
//           }
//       }
//       System.out.println(dp[0]);
//    }
// }