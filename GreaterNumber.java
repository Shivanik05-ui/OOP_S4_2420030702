package mypackage;
import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first integer");
    int a = sc.nextInt();
    System.out.println("Enter second integer");
    int b = sc.nextInt();
   
    
    if(a>b)
    	System.out.println(a + " is Greater");
    else if(b>a)
    	System.out.println(b + " is Greater");
    else
    	System.out.println("Both are equal");
	}

}
