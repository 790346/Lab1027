import java.util.Scanner;

public class StudentListRunner
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Student stu = null;
        
        while(true)
        {
            System.out.println("What would you like to do? ('add' or 'delete') ");
            
            if(input.equals("add"))
            {
                stu.getStudent();
            }
            
            stu.setStudent();
            System.out.println("Here is your student: " + stu);
        }
    }
}