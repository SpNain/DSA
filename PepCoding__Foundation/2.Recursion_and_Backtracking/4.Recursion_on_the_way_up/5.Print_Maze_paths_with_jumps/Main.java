package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int nr = scn.nextInt();
        int nc = scn.nextInt();
        printMazePaths(0,0,nr-1,nc-1,"");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if(sr==dr&&sc==dc){
            System.out.println(psf);
            return;
        }

        // Sp Nain Code - This code is wrong because it only worked for n<=2 && m<=2. Not for every value of n and m.
        // if(sc+1<=dc){
        // printMazePaths(sr,sc+1,dr,dc,psf+"h1");
        // }
        //  if(sc+2<=dc){
        // printMazePaths(sr,sc+2,dr,dc,psf+"h2");
        // }
        // if(sr+1<=dr){
        // printMazePaths(sr+1,sc,dr,dc,psf+"v1");
        // }
        // if(sr+2<=dr){
        // printMazePaths(sr+2,sc,dr,dc,psf+"v2");
        // }
        //if(sr+1<=dr&&sc+1<=dc){
        // printMazePaths(sr+1,sc+1,dr,dc,psf+"d1");
        // }
        // if(sr+2<=dr&&sc+2<=dc){
        // printMazePaths(sr+2,sc+2,dr,dc,psf+"d2");
        // }


        //MB Code
        for(int jmp = 1 ; sc + jmp <= dc ; jmp++){
            printMazePaths(sr,sc+jmp,dr,dc,psf+"h"+jmp);
        }

        for(int jmp = 1 ; sr + jmp <= dr ; jmp++){
            printMazePaths(sr+jmp,sc,dr,dc,psf+"v"+jmp);
        }

        for(int jmp = 1 ; sr + jmp <= dr && sc + jmp <= dc; jmp++){
            printMazePaths(sr+jmp,sc+jmp,dr,dc,psf+"d"+jmp);
        }

        //MB Code Optimization by Sp Nain
        // Code sahi chal rha hai bas iss code ka answer yaha pe diye gye ans se match nhi hota. Lekin har kahi pe ans random aa skta ho waha pe ye code shi hai
        // for(int jmp = 1 ;jmp<=dr||jmp<=dc; jmp++){
        //     if( sc + jmp <= dc)
        //         printMazePaths(sr,sc+jmp,dr,dc,psf+"h"+jmp);
        //     if(sr + jmp <= dr ){
        //         printMazePaths(sr+jmp,sc,dr,dc,psf+"v"+jmp);
        //     }
        //     if( sr + jmp <= dr && sc + jmp <= dc){
        //         printMazePaths(sr+jmp,sc+jmp,dr,dc,psf+"d"+jmp);
        //     }
        // }

    }

}
