package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        floodfill(arr, 0, 0, "", new boolean[n][m]);

    }

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String psf, boolean visited[][]) {

        if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || visited[sr][sc] == true
                || maze[sr][sc] == 1) { // [#1]
            return;
        }
        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(psf);
            return;
        }

        visited[sr][sc] = true;

        floodfill(maze, sr - 1, sc, psf + "t", visited);
        floodfill(maze, sr, sc - 1, psf + "l", visited);
        floodfill(maze, sr + 1, sc, psf + "d", visited);
        floodfill(maze, sr, sc + 1, psf + "r", visited);

        visited[sr][sc] = false;
    }
}

/*
#1. Yha pe visited[r][c] aur maze[r][c] wali conditions pahle nhi likh skte wrna exception out of bond aa jaayega
    to is trike se likhne me sr aur sc pahle hi check ho jaayenge agr wo out of bond honge to condition fail ho jaayegi
    aur hum pahle hi return kr jaayenge.

Logic : Logic simple hai hum alag alag directions me calls lgate hai 
        aur humne ek visited array rkha hua hai jispe hum jaate hi true mark kr dete hai taki hum visited block ko dobara visit na kr ske
        aur jb saari calls khtam ho jaati hai kisi block ke liye to fir us block ko firse false mark kr dete hai
        taki alag path ke liye use visit kiya jaa ske
        jab hum destination pe reach kr jaate hai to path ko print kr dete hai aur agr out of maze || wall || visited already ho to return kr jaate hai
*/