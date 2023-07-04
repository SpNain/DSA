//========== User's Code Starts Here ==========
//write the code here

class Student{
    String Name = "john";
    int roll_no = 2;
    
    public Student(){}
    
    public Student(String Name, int roll_no){
        this.Name = Name;
        this.roll_no = roll_no;
    }
}


// Do not touch the Main method
public class Main
{
    public static void main(String []args)
    {
        Student obj =new Student();
        Student obj1=new Student("vaibhav",101);
        Student obj2=new Student("rahul",102);
        System.out.println(obj1.Name);
        System.out.println(obj2.Name);
        System.out.println(obj.Name);
        
        
        
        
    }
}


//========== User's Code Ends Here ==========
