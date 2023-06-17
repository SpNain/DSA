package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int nr = scn.nextInt();
        int nc = scn.nextInt();

        ArrayList<String> path = getMazePaths(0,0, nr-1, nc-1);
        System.out.println(path);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bList = new ArrayList<>();
            bList.add("");
            return bList;
        }
        ArrayList<String> myPath = new ArrayList<>();
        if(sc+1 <= dc){ // yha pe equal to lgana kaafi jruri hai wrna hum base case tak kabhi nhi pahunchenge
            ArrayList<String> hPath = getMazePaths(sr,sc+1,dr,dc);
            for(String path : hPath){
                myPath.add("h"+path);
            }
        }
        if(sr+1 <= dr){
            ArrayList<String> vPath = getMazePaths(sr+1,sc,dr,dc);
            for(String path : vPath){
                myPath.add("v"+path);
            }
        }
        return myPath;
    }
}

/*
Logic : Hum faith rkh lete hai ki hmari subproblem ke liye path hmara code le aayega 
        to humne bas pattern analize krke un paths me h aur v add kiye hai

hum hpath me "h" aur vpath me "v" isiliye add kr rhe hai 
kyunki hpath me hum call lgate time sc ko +1 krke call lga rhe hai
to jab hum waps aayenge to hpath me jo path pda hoga 
us tak reach krne ke liye hume sc me ek kdam bhadana hoga which means 1 step in horizontal direction
same yahi reason hai vpath me "v" add krne ka
*/