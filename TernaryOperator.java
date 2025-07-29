package mypackage;
import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = sc.nextInt();
    System.out.println("Enter second number: ");
    int b = sc.nextInt();
    int max = (a > b) ? a : b;
     System.out.println("Greater number is :" + max);
	}

}
