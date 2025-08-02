package Arrays;
import java.util.Scanner;
public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int marks[] = new int[6];
	        int total = 0;

	        System.out.println("Enter marks of 6 subjects:");
	        for (int i = 0; i < 6; i++) {
	            marks[i] = sc.nextInt();
	            total += marks[i];
	        }

	        System.out.println("Subject Marks:");
	        for (int i = 0; i < marks.length; i++) {
	            System.out.println(marks[i]);
	        }

	        double average = total / 6.0;
	        System.out.println("Total = " + total);
	        System.out.println("Average = " + average);
	}

}
