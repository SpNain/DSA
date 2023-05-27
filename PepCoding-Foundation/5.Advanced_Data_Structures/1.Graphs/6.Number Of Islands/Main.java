import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int m = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[m][n];

    for (int i = 0; i < arr.length; i++) {
      String parts = br.readLine();
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
      }
    }

    // write your code here
    System.out.print(numOfIslands(arr));
  }
  public static int numOfIslands(int board[][]) {
    int count = 0;
    for (int i = 0 ; i < board.length ; i++) {
      for (int j = 0 ; j < board[0].length ; j++) {
        if (board[i][j] == 0) {
          count++;
          numOfIslandsHelper(board, i, j); // mark whole one island at one call
        }
      }
    }
    return count;
  }

  public static void numOfIslandsHelper(int[][] board, int r, int c) {
    if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] == 1 || board[r][c] == 2) {
      return;
    }


    board[r][c] = 2;
    numOfIslandsHelper(board, r - 1, c); // north
    numOfIslandsHelper(board, r, c + 1); // east
    numOfIslandsHelper(board, r, c - 1); // west
    numOfIslandsHelper(board, r + 1, c); // south
  }

}

/*
ye question graph ka nhi hai leki kyunki gcc type ki approach hai to isme daal rkha hai
Logic : gcc+flood fill
jab bhi ek call lagti hai to uske aas pass jitne bhi adjacent 0s hote hai sbko 2 mark karke aa jaati hai
just like gcc jisme jab bhi ek vertex ko visit karte the to uske saare neighbour ko visit karke aa jaate the
*/










