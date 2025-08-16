package StringImmutability;

public class AllStringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuffer s1 = new StringBuffer("Java");
     System.out.println(s1.length());
     System.out.println(s1.append(" Programming!"));
     System.out.println(s1.replace(0, 4, "C"));
     System.out.println(s1.delete(0, 3));
     System.out.println(s1.deleteCharAt(0));
     System.out.println(s1.reverse());
     System.out.println(s1.capacity());
     System.out.println(s1.charAt(2));
     System.out.println(s1.append("Hello!"));
     System.out.println(s1.insert(4, "World"));
     System.out.println(s1.substring(2));
     System.out.println(s1.toString());
     
	}

}
