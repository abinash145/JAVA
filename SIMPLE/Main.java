import java.util.*;

class Main{
        public static void main(String[] args) {
            int a ;
            int switchValue;
            char loop='y';
            char loopAdd='y';
            boolean check=true;
            Scanner obj =new Scanner(System.in);
            LinkedList<Student> studentData= new LinkedList<Student>();  
            studentData.add(new Student(1,"John","Cena"));
            studentData.add(new Student(2,"hari","cast"));
            studentData.add(new Student(3,"Hanuman","Ram"));
            studentData.add(new Student(4,"","duwa"));
            studentData.add(new Student(5,"obama","duwa"));
      
            
            while(loop=='y'){

              System.out.println("**************************************");
              System.out.println("MENU");
              System.out.println("**************************************");
              System.out.println("1.ADD STUDENT");
              System.out.println("**************************************");
              System.out.println("2.LOOK STUDENT INFORMATION BY ROLLNO");
              System.out.println("**************************************");
              System.out.println("3,PRINT ALL STUDENT ");
              System.out.println("**************************************");
              System.out.println("4.UPDATE STUDENT INFORMATION BY ROLLNO");
              System.out.println("**************************************");
              System.out.println("5.DELETE STUDENT INFORMATION BY ROLLNO");
              System.out.println("**************************************");
              System.out.println("6.EXIT");
              System.out.println("**************************************");
              switchValue=obj.nextInt();
              switch (switchValue) {
                case 1:
                  while(loopAdd=='y'){
                  Data data =new Data(obj);
                  studentData.add(new Student(data.rollNo(),data.FirstName(),data.LastName()));
                  System.out.println("wanna add again press y");
                  loopAdd=obj.next().charAt(0);
                  }
                  break;
                  
                case 2:
                  System.out.println("enter student roll to look value");
                  a = obj.nextInt();
                  System.out.println("ROLLNO="+studentData.get(a-1).rollNo());
                  System.out.println("FULLNAME="+studentData.get(a-1).FullName());
                  break;
                
                  case 3:
                  System.out.println("here are the information of all student");
                  for(Student str : studentData){
                    System.out.println("ROLLNO="+str.rollNo());
                    System.out.println(str.FullName());
                    System.out.println(".....................................................................................");
                    
                  }
                  break;


                case 4:
                  System.out.println("enter which rollno u want to update");
                  a = obj.nextInt();
                  System.out.print("");
                  studentData.get(a-1).FirstName=obj.nextLine();
                  System.out.println("enter new UPDATE FirstName");
                  studentData.get(a-1).FirstName=obj.nextLine();
                  System.out.println("enter new UPDATE LastName");
                  studentData.get(a-1).LastName=obj.nextLine();
                  System.out.println(studentData.get(a-1).FullName());
                  break;


                case 5:
                  System.out.println("Enter student roll no to delete");
                  a = obj.nextInt();
                  studentData.remove(a-1);
                  for(Student str : studentData){
                    System.out.println("ROLLNO="+str.rollNo());
                    System.out.println(str.FullName());
                    System.out.println(".....................................................................................");            
                  };
                  break;

                  case 6:
                    loop='n';
                  break;
            
                  }
        }

        

   }
}