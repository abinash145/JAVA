import java.util.*;
public class Data{
    private int roll;
    private String FirstName;
    private String LastName;
    Data(Scanner obj){
        System.out.println("Enter your Student Roll");
        this.roll=obj.nextInt();
        System.out.println("");       
        this.FirstName=obj.nextLine();
        System.out.println("Enter your Student FIrstName");
        this.FirstName=obj.nextLine();
        System.out.println("Enter your Student LastName");
        this.LastName=obj.nextLine();
    }
    public int rollNo(){
        return this.roll;

    }
    public  String FirstName(){
        return this.FirstName;
        
    }
    public  String LastName(){
        return this.LastName;
        
    }
    public  String FullName(){
        return this.FirstName+" "+this.LastName;
        
    }
    
}