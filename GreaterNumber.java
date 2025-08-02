package mypackage;
import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first integer:");
        int a = sc.nextInt();
        
        System.out.println("Enter second integer:");
        int b = sc.nextInt();
        
        System.out.println("Enter third integer:");
        int c = sc.nextInt();
        
        if ((a > b) && (a > c))
            System.out.println(a + " is greater than " + b + " and " + c);
        else if ((b > a) && (b > c))
            System.out.println(b + " is greater than " + a + " and " + c);
        else if ((c > a) && (c > b))
            System.out.println(c + " is greater than " + a + " and " + b);
        else
            System.out.println("All three numbers are equal or two are equal and greatest");
	}

}

