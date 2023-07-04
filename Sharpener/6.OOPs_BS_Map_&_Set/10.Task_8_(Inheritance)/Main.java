//========== User's Code Starts Here ==========
//Write the code Below
class Member{
    String name;
    int age;
    String pn;
    String address;
    int salary;
    
    public void printSalary(){
        System.out.println(salary);
    }
    
    public Member(String name, int age, String pn, String address, int salary){
        this.name = name;
        this.age = age;
        this.pn = pn;
        this.address = address;
        this.salary = salary;
    }
    
}

// hume dono jgah super call krna pdega 
// kyunki agr humne sirf 1 class me constructor call kra to dusri class me apne app contructor call hoga like this super() 
// to jo constructor humne bnaya h parent class me uske aur jo yhape call hua h uske parameters me difference h to error aa jaayega

class Employee extends Member{
    String spl;
    
    public void print_details(){
        System.out.println(name);
        System.out.println(spl);
        printSalary();
    }
    
    public Employee(String name, int age, String pn, String address, int salary, String spl){
        // this.name = name;
        // this.age = age;
        // this.pn = pn;
        // this.address = address;
        // this.salary = salary;
        super(name,age,pn,address,salary);
        this.spl = spl;
    }
}

class Manager extends Member{
    String dep;

    public void print_details(){
        System.out.println(name);
        System.out.println(dep);
        printSalary();
    }
    
    public Manager(String name, int age, String pn, String address, int salary, String dep){
        // this.name = name;
        // this.age = age;
        // this.pn = pn;
        // this.address = address;
        // this.salary = salary;
        super(name,age,pn,address,salary);
        this.dep = dep;
    }
}



//Do Not change the Below Main Method


public class Main {
    public static void main(String args[]) {
        Employee obj = new Employee("Ram",25,"7003","Bangalore",1000,"cse");
        obj.print_details();
        
        Employee obj1 = new Employee("Shyam",250,"8098","Chennai",2000,"civil");
        obj1.print_details();
        
        Manager obj_Man = new Manager("babu",100,"1234","Bangalore",1000,"JP");
        obj_Man.print_details();
        
        Manager obj1_Man = new Manager("Rao",250,"456","Kerala",3000,"GC");
        obj1_Man.print_details();

    }
}
//========== User's Code Ends Here ==========
