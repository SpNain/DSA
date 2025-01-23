import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {   // ek ek row travel krne ke liye
        int potSaddlePoint = arr[i][0];   // hum har ek row ke first element ko hum hmara potential saddle point maan lete hai.
        int colno = 0;                     // hum maan lete hai ki hmara potential saddle point ka col no. 0 hai
      for (int j = 1; j < arr[0].length; j++) {   //  us row ke columns ko travel krne keliye
        if (potSaddlePoint > arr[i][j]) {       // agr hume us row ka koi bhi element hmare potential saddle point se chota mil jaata hai
          potSaddlePoint = arr[i][j];           // to hum us element ko apna pot saddle point maan lete hai kyunki hume row me min element dundna hai
          colno = j;                            // aur us saddle point ke col ko pot saddle point ka colno maan lete hai 
        }
      }
      boolean flag = true;
      for (int r = 0; r < arr.length; r++) {
        if (potSaddlePoint < arr[r][colno]) {   // fir hum usi colno ke column ko 0 se lekr n tak search krte hai ki kahi koi element us col me hmare psp se bda to nhi h
          flag = false;                          // agr koi element hmare psp se bda mil jaata hai to flag ko false kr dete hai taki hmara psp print na ho
          break;                                // aur break kr jaate hai bekar ke iterations se bchne ke liye
        }
      }
      if (flag == true) {       // agr kabhi aisa hua ki hamre psp se koi bhi value col me bdi nhi mili to matlab hamra psp us col me sbse bda hai joki apni row me minimum bhi tha
        System.out.print(potSaddlePoint);   // to matlab hume apna saddle point mil gya hai use print kr dete hai
        return;           // aur return kr jaate hai taki loop bhi end ho jaaye aur INVALID INPUT bhi na print ho 
      }
    }
    System.out.print("Invalid input");  // agr kabhi bhi saddle point nhi mila to return to krega nhi aur loop khatam hote hi ye print hoga
  }
}

/*
Note : There can't be two saddle points in a matrix. 
       Explaination : 
                     <See image for understanding>
                     Maanlo f aur l saddle points h 
                     which means h is greater than f and j is less than f which concludes j<h
                     and h is less than l and j is greater than l which concludes h<j
                     As both contradicts each other thats why two saddle points aren't possible.
*/