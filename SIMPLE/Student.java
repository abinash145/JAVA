public class Student{
    int roll;
    String FirstName;
    String LastName;


    public Student(int roll,String FirstName,String LastName){
        this.roll=roll;
        this.FirstName=FirstName;
        this.LastName=LastName;
    }
    public  int rollNo(){
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