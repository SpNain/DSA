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
        
        
        // MS Solution : Optimized
        HashMap<Character,Integer> hm = new HashMap<>();
        
        char hiFreqChar = ' ';
        int maxFreq = 0;
        
        for(int i= 0; i<line.length(); i++){
            
            char ch =line.charAt(i);
            
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
            
            if(hm.get(ch)>maxFreq){
                maxFreq = hm.get(ch);
                hiFreqChar = ch;
            }
            else if(hm.get(ch) == maxFreq && ch < hiFreqChar){
                hiFreqChar = ch;
            }
        }
        
        System.out.println(hiFreqChar);
    }

}