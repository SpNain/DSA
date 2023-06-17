// Sp Nain - 1st revision
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        System.out.println(getMazePaths(0,0,n-1,m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr == dr && sc == dc){
            ArrayList<String> blist = new ArrayList<>();
            blist.add("");
            return blist;
        }
        ArrayList<String> myList = new ArrayList<>();
  
        for(int jump = 1; sc+jump<=dc; jump++){
    
              ArrayList<String> hm = getMazePaths(sr,sc+jump,dr,dc);
              for(String s : hm){
                  myList.add("h"+jump+s);
              }

        }
        for(int jump = 1; sr+jump<=dr; jump++){

              ArrayList<String> vm = getMazePaths(sr+jump,sc,dr,dc);
              for(String s : vm){
                  myList.add("v"+jump+s);
              }
            
        }
        for(int jump = 1; sr+jump<=dr&&sc+jump<=dc; jump++){
            
              ArrayList<String> dm = getMazePaths(sr+jump,sc+jump,dr,dc);
              for(String s : dm){
                  myList.add("d"+jump+s);
              }
            
        }
        return myList;
    }

}

/* 
Main Logic : To main logic hmara yeh tha ki iss baar hum jump bhi lga skte hai to humne jumps ke liye loop lgakar aage call lgayi

3 loops Logic : Hmara kaam to ek loop se bhi ho jaata lekin fir call kuch aise lgti
        pahle jump 1 ke liye horizontal aur uske baad vertical aur fir diagonal 
        aur fir yahi call next jumps ke liye lgti
        lekin ans jo hai wo match kr rha hai 
        jab palhe saare possible jumps ke liye horzonatal call lge 
        uske baad vertical uske baad diagonal 
        isiliye humne teen alag alag loop lgaye hai

        Single loop aise lgta :
        
        int maxJump = dr+1>dc+1 ? dr+1 : dc+1;
        
        for(int jump = 1; jump<=maxJump; jump++){
            if(sc+jump<=dc){
              ArrayList<String> hm = getMazePaths(sr,sc+jump,dr,dc);
              for(String s : hm){
                  myList.add("h"+jump+s);
              }
            }
            if(sr+jump<=dr){
              ArrayList<String> vm = getMazePaths(sr+jump,sc,dr,dc);
              for(String s : vm){
                  myList.add("v"+jump+s);
              }
            }
            if(sr+jump<=dr&&sc+jump<=dc){
              ArrayList<String> dm = getMazePaths(sr+jump,sc+jump,dr,dc);
              for(String s : dm){
                  myList.add("d"+jump+s);
              }
            }
        }
*/