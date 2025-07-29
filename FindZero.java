package practical;
import java.util.Scanner;
public class FindZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter numbers (enter 0 to stop):");

   
     while (true) {
         int num = sc.nextInt();
         if (num == 0) {
             break;  
         }
         System.out.println("You entered: " + num);
     }

     System.out.println("Program ended. You entered 0.");
	}

}
