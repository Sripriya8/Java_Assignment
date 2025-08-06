import java.util.Scanner;
public class Student{
    
    String name;
    int roll;
    String batch;

    public Student(String name, int roll, String batch){
        this.name = name;
        this.roll = roll;
        this.batch = batch;
    }
    
    //1. details.
    public void student_details(){
        System.out.println("Name : "+ name);
        System.out.println("Roll No : "+ roll);
        System.out.println("Batch : "+ batch);
    }

    //2. total marks.
    public int student_totalMarks(int sub1, int sub2, int sub3){
        return sub1+sub2+sub3;
    }

   //3. grade.
    public char student_grade(float percentage){
        if(percentage>90.0f && percentage<=100.0f)  return 'A';
        else if(percentage>80.0f && percentage<=90.0f) return 'B';
        else if(percentage>70.0f && percentage<=80.0f) return 'C';
        else if(percentage>60.0f && percentage<=70.0f) return 'D';
        else if(percentage>50.0f && percentage<=60.0f) return 'E';
        else return 'F';
    }

    //4. scholarship eligibility.
    public boolean student_scholarship_eligibility(float percentage){
        if(percentage >= 80.0f) return true;
        else return false;
    }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student obj = new Student("Ch.Sripriya", 10, "Java-55R");
        
        //1. student details method.
        obj.student_details();

        System.out.print("Enter marks in Subject1: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter marks in Subject2: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter marks in Subject3: ");
        int sub3 = sc.nextInt();

        //2. student total marks method.
        int total = obj.student_totalMarks(sub1, sub2, sub3);
        System.out.println(String.format("Total Marks = %d \n", total));

        float percentage = ((float)total/300)*100f;

        //3. student grade based on percentage method.
        char grade = obj.student_grade(percentage);
        System.out.println(String.format("Grade = %c \n", grade));

        //4. scholarship eligibility method.
        boolean isEligible = obj.student_scholarship_eligibility(percentage);
        if(isEligible) System.out.println("Yes, eligible. \n");
        else System.out.println("Not eligible. \n");

        
    }
}