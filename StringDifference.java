package StringImmutability;

public class StringDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str1="Java";
     String str2="Java";
     System.out.println(str1==str2);
     str1 = str1 + " Programming";
     System.out.println(str1);
     System.out.println(str1==str2);
     String str3="Java Programming";
     System.out.println(str3);
     System.out.println(str1==str3);
     System.out.println(str1.equals(str3));
	}

}
