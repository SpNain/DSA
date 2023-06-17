import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
               
        Scanner scn = new Scanner(System.in);
        
        String str = scn.nextLine();
        printKPC(str,"");

    }

    static String keypad[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf) {

        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        
        char ch = str.charAt(0);
        String roq = str.substring(1);
        String word  = keypad[Integer.parseInt(ch+"")];
        
        for(int i = 0 ; i < word.length() ; i++){
            
            printKPC(roq,asf+word.charAt(i));
        }
  
    }

}

/*
Logic :

Hum str ke 0th char ke correspondig word mangwa lenge 
aur us word ke har ek char ke liye roq ko call lgayenge ek ek krke aur asf me wo char add krte jaayenge
to jb string ki length 0 ho jaayegi to hmare asf me jo pda hoga wo print kr denge
*/