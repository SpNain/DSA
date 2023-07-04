//========== User's Code Starts Here ==========
class Employee
{
    //Write the code here
    String Name;
    int yoj;
    String address;
    
    public Employee(String Name, int yoj, String address){
        this.Name = Name;
        this.yoj = yoj;
        this.address = address;
    }
    
    public void print_details(){
        System.out.println(Name + " " + yoj + " " + address);
    }
    
    
}
//Do Not change the Below Main Method


public class Main {
    public static void main(String args[]) {
        Employee t=new Employee("ram",1992,"Bangalore");
        t.print_details();
        
        Employee x=new Employee("shyam",2010,"Lucknow");
        x.print_details();
        
        Employee y=new Employee("babu_rao",2015,"Delhi");
        y.print_details();

    }
}
//========== User's Code Ends Here ==========
