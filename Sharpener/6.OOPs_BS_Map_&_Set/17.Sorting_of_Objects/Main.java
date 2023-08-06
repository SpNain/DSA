//========== User's Code Starts Here ==========
import java.util.*;
class Employee
{
    String name;
    int salary;
    Employee(String name,int salary)
    {
        this.name=name;
        this.salary =salary;
    }
}
//do Not change the above code
class Solution
{
   
    public static Employee[] sort_array(Employee arr[],int n)
    {
        /*Function to sort the array in ascending order
        After sorting return the sorted array */
        
        /*
        // Method 1 :
        // Step 1 : create data structures to store values
        HashMap<Integer,String> hm = new HashMap<>();
        int[] res = new int[n];
        
        // Step 2 : Iterate array & fill hashmap and res array
        for(int i = 0; i<n; i++){
            Employee val = arr[i];
            hm.put(val.salary,val.name);
            res[i] = arr[i].salary;
        }
        
        // Step 3 : Sort res array (if inbuilt sort not allowed use any sorting algorithm)
        Arrays.sort(res);
        
        // Step 4 : Iterate res array and fill arr in inc sorted order
        //          We get elements of res(key) one by one and using key we fill arr
        //          As the res array is sorted so the arr will get filled up in inc order of salary
        for(int i = 0; i<n; i++){
            
            int key = res[i];
            arr[i].salary = key;
            arr[i].name = hm.get(key);
        }
        
        // Step 5 : return arr
        return arr;
        */
        
        /*
        // Method 2 : Using bublle srot
        for (int itr = 1; itr <= n-1; itr++) {
            for (int j = 0; j <= n-1-itr; j++) {
                if(arr[j].salary > arr[j+1].salary){
                    // int tempSalary = arr[j].salary;
                    // arr[j].salary = arr[i].salary;
                    // arr[i].salary = tempSalary;
                    
                    // String tempName = arr[j].name;
                    // arr[j].name = arr[i].name;
                    // arr[i].name = tempName;
                    
                    Employee temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        
        return arr;
        */
        
        // Method 3 :
        Arrays.sort(arr,Comparator.comparingInt(employee -> employee.salary));
        
        return arr;
        
        /* Dont change anything below. If changed click on reset. */
        
    
    }
}
public class Main
{
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Solution s= new Solution();
        int n =Integer.parseInt(sc.nextLine());
        Employee arr[]=new Employee [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new Employee(sc.nextLine(),Integer.parseInt(sc.nextLine()));
        }
        Employee[] output = s.sort_array(arr, n);
        for(int i=0;i<n;i++)
            System.out.println(output[i].name+" "+output[i].salary);
    }
}
//========== User's Code Ends Here ==========