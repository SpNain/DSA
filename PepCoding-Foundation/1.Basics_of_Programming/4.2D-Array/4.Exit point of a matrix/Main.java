package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();

        int mat[][] = new int[nr][nc];
        for(int i = 0 ; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                mat[i][j] = scn.nextInt();
            }
        }

        // logic
        int i = 0 , j = 0 , dir = 0;
        int prevI = -1, prevJ = -1;

        while(i >= 0 && j >= 0 && i < nr && j < nc){
            dir = (dir+mat[i][j])%4;  // agr current block pe 0 hoga to hmari direction me koi change nhi aayega lekin agr value 1 hogi to direction change ho jaayegi.
            prevI = i;
            prevJ = j;

            if(dir == 0){
                j++;
            }else if(dir == 1){
                i++;
            }else if(dir == 2){
                j--;
            }else if(dir == 3){
                i--;
            }
        }

        System.out.println(prevI);
        System.out.println(prevJ);
    }

}

/*
Logic behind logic :

1. dekho hum while loop lagate hai iss type se ki jaise hi hmari values maze se bahar jaaye loops na chale jisse hum exit point nikal lenge
2. hum loop ke andar jaate hi direction check krte hai ki hum kis direction me move kr rhe hai using the value of that block
   ab kyunki directions sirf 4 hai to humne direction ka modulus 4 se kar diya jisse hume sirf 4 no. mil ske that are 0,1,2,3
   aur saath hi hum i aur j ko store krwa lete hai update hone se pahle jisse ki jum i aur j ki value ki out of maze aayegi to loop break ho jaayega aur usse just pahle jo value i aur j ki thi wo hmare pass hmae variable me pdi hogi jise hum print krwa denge last me
3. ab humne dekha 4 directions hai to humne 4 alag alag code likhne honge travel krne ke liye har direction ke hisab se
4. to humne har direction ke liye code likha jisse hum us direction ke hisab se move kr ske 
   aur hum usi hisab se apne row or columns ko update kar dete hai

*/

/*
// SP Nain - 1st revision
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int nr = scn.nextInt();
        int nc = scn.nextInt();

        int mat[][] = new int[nr][nc];

        // input
        for(int i = 0 ; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        
        
        int dir = 0;
        int r = 0,c = 0;
        int crp = 0, ccp = 0, prp = 0, pcp = 0;
        while(r>=0&&r<=nr-1&&c>=0&&c<=nc-1){
            //east
            if(dir == 0){
                if(mat[r][c] == 0){
                    c = c+1;
                    prp=crp;
                    pcp = ccp;
                    crp = r;
                    ccp = c;
                }
                else if (mat[r][c] == 1){
                    r = r+1;
                    dir++;
                    dir = dir%4;
                    prp=crp;
                    pcp = ccp;
                    crp = r;
                    ccp = c;
                }
            }
            //south
            else if (dir == 1){
                if(mat[r][c] == 0){
                    r = r+1;
                    prp=crp;
                    pcp = ccp;
                    crp = r;
                    ccp = c;
                }
                else if (mat[r][c] == 1){
                    c = c-1;
                    dir++;
                    dir = dir%4;
                    prp=crp;
                    pcp = ccp;
                    crp = r;
                    ccp = c;
                }
                
            }
            //west
            else if (dir == 2){
                if(mat[r][c] == 0){
                    c = c-1;
                    prp=crp;
                    pcp = ccp;
                    crp = r;
                    ccp = c;
                }
                else if (mat[r][c] == 1){
                    r = r-1;
                    dir++;
                    dir = dir%4;
                    prp=crp;
                    pcp = ccp;
                    crp = r;
                    ccp = c;
                }
                
            }
            //north
            else if (dir == 3){
                if(mat[r][c] == 0){
                    r = r-1;
                    prp=crp;
                    pcp = ccp;
                    crp = r;
                    ccp = c;
                }
                else if (mat[r][c] == 1){
                    c = c+1;
                    dir++;
                    dir = dir%4;
                    prp=crp;
                    pcp = ccp;
                    crp = r;
                    ccp = c;
                }
            }
        }
        System.out.println(prp+"\n"+pcp);

    }

}

*/


/*
Logic behind logic :

1. dekho hum while loop lagate hai iss type se ki jaise hi hmari values maze se bahar jaaye loops na chale jisse hum exit point nikal lenge
2. ab humne dekha 4 directions hai to humne 4 alag alag code likhne honge travel krne ke liye har direction ke hisab se
3. to humne har direction ke liye code likha ki agr hum jis block par khade hai agr us block par 0 hai to usi direction me move kr jaa
   aur agr us block par 1 hai to change your direction 
   aur hum usi hisab se apne row and columns ko update kar dete hai
4. humne direction ko notify krne ke liye har direction ko ek no. assign kiya hai aur jaise hi direction change hoti hai hum no. ko increase kr dete hai jisse humara code fir aage us direction ke hisab se chale
   ab kyunki directions sirf 4 hai to humne direction ka modulus 4 se kar diya jisse hume sirf 4 no. mil ske that are 0,1,2,3
*/


/*
// Short version
// SP Nain - 1st revision
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int nr = scn.nextInt();
        int nc = scn.nextInt();

        int mat[][] = new int[nr][nc];

        // input
        for(int i = 0 ; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        
        
        int dir = 0;
        int r = 0,c = 0;
        int prp = 0, pcp = 0;
        while(r>=0&&r<=nr-1&&c>=0&&c<=nc-1){
            prp = r;
            pcp = c;
            
            //east
            if(dir == 0){
                if(mat[r][c] == 0){
                    c = c+1;
                }
                else if (mat[r][c] == 1){
                    r = r+1;
                    dir++;
                    dir = dir%4;
                   
                }
            }
            //south
            else if (dir == 1){
                if(mat[r][c] == 0){
                    r = r+1;
                   
                }
                else if (mat[r][c] == 1){
                    c = c-1;
                    dir++;
                    dir = dir%4;
                   
                }
                
            }
            //west
            else if (dir == 2){
                if(mat[r][c] == 0){
                    c = c-1;
                 }
                else if (mat[r][c] == 1){
                    r = r-1;
                    dir++;
                    dir = dir%4;
                }
                
            }
            //north
            else if (dir == 3){
                if(mat[r][c] == 0){
                    r = r-1;
                   
                }
                else if (mat[r][c] == 1){
                    c = c+1;
                    dir++;
                    dir = dir%4;
                }
            }
            
        }
        System.out.println(prp+"\n"+pcp);

    }

}

*/