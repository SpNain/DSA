import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //Sp Solution : BRUTE FORCE

        // char hiFreqChar = ' ';
        // int maxFreq = 0;

        // for(int i= 0; i<line.length(); i++){

        //     char ch = line.charAt(i);
        //     int freq = 1;

        //     for(int j = i; j<line.length(); j++){
        //         if(line.charAt(j) == ch){
        //             freq++;
        //         }
        //         count++;
        //     }

        //     // System.out.println(ch +" "+freq);

        //     if(freq>maxFreq){
        //         maxFreq = freq;
        //         hiFreqChar = ch;
        //     }
        //     else if(freq == maxFreq && ch < hiFreqChar){
        //         hiFreqChar = ch;
        //     }
        // }
        // System.out.println(hiFreqChar);

        // MB Solution : Optimized
        HashMap<Character, Integer> hm = new HashMap<>();

        char hiFreqChar = ' ';
        int maxFreq = 0;

        for (int i = 0; i < line.length(); i++) {

            char ch = line.charAt(i);

            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }

            if (hm.get(ch) > maxFreq) {
                maxFreq = hm.get(ch);
                hiFreqChar = ch;
            } else if (hm.get(ch) == maxFreq && ch < hiFreqChar) {
                hiFreqChar = ch;
            }
        }

        System.out.println(hiFreqChar);
    }

    // Sreesh Solution
    public static void printMaxFreqCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        char hiFreqChar = ' ';
        int maxfreq = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int oldFreq = map.getOrDefault(ch, 0);  // agr ch pahle se nhi h to 0 aayega oldFreq me nhi to wo us ch ke saamne freq pdi hogi wo aayegi
            map.put(ch, oldFreq + 1);
            if (oldFreq + 1 > maxfreq) {
                maxfreq = oldFreq + 1;
                hiFreqChar = ch;
            }
        }
        System.out.print1n(hiFreqChar);
    }
}