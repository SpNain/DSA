import java.util.Scanner;

public class Main {
    

//========== User's Code Starts Here ==========

    public static String sharpenerParser(String command) {
      String res = "";
      
      for(int i = 0; i<command.length(); i++){
          if(command.charAt(i) == 'S') res += "S";
          else if(command.charAt(i) == '(') res += "h";
          else if(command.charAt(i) == 'n') res += "arp";
      }
      
      return res;
    }
    
//========== User's Code Ends Here ==========


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        System.out.println(sharpenerParser(command));
        sc.close();
    }
}