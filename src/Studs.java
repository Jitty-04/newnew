
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
        ArrayList<Studs> earr = new ArrayList<Studs>();
        while (true) {
            System.out.println("Select an option \n 1 - Add Employee \n 2 - View Employee \n 3 - Search an Employee \n" +
                    "4 - Delete an Employee \n 5 - Exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
        }
    }
}
