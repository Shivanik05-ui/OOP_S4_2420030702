package practical;
import java.util.Scanner;
public class PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a = sc.nextInt();
    if(a > 0)
    	System.out.println("Number is positive");
    else if( a < 0)
    	System.out.println("Number is negative");
    else
    	System.out.println("Zero");
	}

}
