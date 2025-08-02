package Arrays;
import java.util.Scanner;
public class ReadAndprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];  

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
