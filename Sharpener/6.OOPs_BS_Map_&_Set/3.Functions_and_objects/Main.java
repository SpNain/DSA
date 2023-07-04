//========== User's Code Starts Here ==========
class Triangle
{
    //Write the code here
    int side1;
    int side2;
    int side3;
    
    public Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public int calculate_area(){
        return side1 * side2 * side3;
    }
    
    public int calculate_perimeter(){
        return side1+side2+side3;
    }
    
    
}
//Do Not change the Below Main Method


public class Main {
    public static void main(String args[]) {
      Triangle t=new Triangle(3,4,5);
      System.out.println(t.calculate_area());
      int per=t.calculate_perimeter();
      System.out.println(per);
      t=new Triangle(9,10,11);
      System.out.println(t.calculate_area());
      per=t.calculate_perimeter();
      System.out.println(per);
    }
}
//========== User's Code Ends Here ==========
