package practical;
import java.util.Scanner;
public class PrintingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number");
     int num = sc.nextInt();
     for (int i=1; i<=num ;i++)
     {
    	 System.out.print(i + " ");
     }
	}

}
