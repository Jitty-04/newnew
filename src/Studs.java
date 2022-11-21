
import java.util.*;
import java.util.ArrayList;
        class Student{
    String name;
    int rollnumber;
    String admno;
    String college;

            public Student(String name, int rollnumber, String admno, String college) {
                this.name = name;
                this.rollnumber = rollnumber;
                this.admno = admno;
                this.college = college;
            }
        }
public class Studs {
    public static void main(String a) {
        ArrayList<Student> earr = new ArrayList<Student>();
        while (true) {
            System.out.println("Select an option \n 1 - Add Employee \n 2 - View Employee \n 3 - Search an Employee \n" +
                    "4 - Delete an Employee \n 5 - Exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter student details ");
                    Scanner obj = new Scanner(System.in);
                    System.out.println("enter the name");
                    String name = obj.next();
                    System.out.println("Enter rollno");
                    int rollnumber = obj.nextInt();
                    System.out.println("Enter admission number");
                    String admno = obj.next();
                    System.out.println("Enter college");
                    String college = obj.next();

                    Student e = new Student(name, rollnumber, admno, college);
                    earr.add(e);
                    break;
            }
        }
    }
}
