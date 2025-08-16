package StringImmutability;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuffer s1 = new StringBuffer("Hello");
     System.out.println(s1);
     s1 = s1.append(" World!!");
     System.out.println(s1);
	}

}
