package Arrays;

public class SmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int[] arr = {5, 3, 9, 1, 6};
	        int min = arr[0];
	        int max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	}
	        System.out.println("Smallest: " + min);
	        System.out.println("Largest: " + max);
	}
}
