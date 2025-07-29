package practical;
import java.util.Scanner;
public class WeekAndDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter day number ( 1 to 7 ): ");
     int num = sc.nextInt();
     String day;
     if(num==1)
     {
    	day="Monday"; 
     }
     else if(num==2) {
    	 day="Tuesday";
     }
     else if(num==3){
    	 day="Wednesday";
     }
     else if(num==4) {
    	 day="Thursday";
     }
     else if(num==5) {
    	 day="Friday";
     }
     else if(num==6) {
    	 day="Saturday"; 
     }
     else if (num == 7) {
         day = "Sunday";
     } else {
         day = "Invalid day number! Please enter a number between 1 and 7.";
     }

     System.out.println("Day name is: " + day);
	}

}
