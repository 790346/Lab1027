import java.util.Scanner;

public class Student
{
    int stuID;
    double stuGPA;
    String stuName;
    
    public double input2;
    public String input1;
    public int input0;
    
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    
    public Student(int id, int gpa, String name)
    {
        
    }
    
    public void getStudent()
    {
        System.out.println("What is the ID of your student? ");
        input0 = sc.nextInt();
        
        System.out.println("What is the name of your student? ");
        input1 = sc.nextLine();
        
        System.out.println("What is the gpa of your student? ");
        input2 = sc.nextInt();
    }
    
    public void setStudent()
    {
        stuID = input0;
        stuGPA = input2;
        stuName = input1;
    }
}