package practical;
import java.util.Scanner;
public class MarksGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter marks: ");
     int marks = sc.nextInt();
     if (marks >= 90 && marks <= 100) 
    	 System.out.println("grade = A+");
      else if (marks >= 80) 
    	 System.out.println("grade = A");
      else if (marks >= 70) 
    	 System.out.println("grade = B");
      else if (marks >= 60) 
    	 System.out.println("grade = C");
      else if (marks >= 50) 
    	 System.out.println("grade = D");
      else if (marks >= 35) 
    	 System.out.println("grade = E");
      else  
    	 System.out.println("grade = F (Fail)");
	}
}
