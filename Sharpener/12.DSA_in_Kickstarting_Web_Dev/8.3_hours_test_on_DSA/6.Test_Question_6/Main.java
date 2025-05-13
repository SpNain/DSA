import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


public class Main {



//========== User's Code Starts Here ==========

    static int salaryOfRohan(int X, int Y, String S) {

        //your code here

        int toatalDaysOfWork = 0;
        int maxContDaysOfWork = 0;
        int currContDaysOfWork = 0;

        for(int i = 0; i<S.length(); i++){
            if(S.charAt(i) == '1'){
                toatalDaysOfWork++;
                currContDaysOfWork++;
            }
            else{
                if(currContDaysOfWork > maxContDaysOfWork)
                    maxContDaysOfWork = currContDaysOfWork;
                currContDaysOfWork = 0;
            }
        }

        if(currContDaysOfWork > maxContDaysOfWork)
                    maxContDaysOfWork = currContDaysOfWork;

        return (X*toatalDaysOfWork + Y*maxContDaysOfWork);

    }

//========== User's Code Ends Here ==========



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        String S = scanner.next();
        System.out.println(salaryOfRohan(X, Y, S));
    }
}
