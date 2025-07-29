package mypackage;
import java.util.Scanner;
public class CompoundAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        System.out.println("Original num = " + num);
	        num+=5;
	        System.out.println(num);
	        num-=2;
	        System.out.println(num);
	        num*=3;
	        System.out.println(num);
	        num/=2;
	        System.out.println(num);
	        num%=4;
	        System.out.println(num);
	}

}
