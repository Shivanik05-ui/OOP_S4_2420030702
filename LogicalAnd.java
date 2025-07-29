package mypackage;
import java.util.Scanner;
public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Did you pass theory (true/false)? ");
	        boolean theory = sc.nextBoolean();
	        System.out.print("Did you pass practical (true/false)? ");
	        boolean practical = sc.nextBoolean();

	        if (theory && practical)
	            System.out.println("You passed both theory and practical.");
	        else
	            System.out.println("You did not pass both exams.");
	}

}
