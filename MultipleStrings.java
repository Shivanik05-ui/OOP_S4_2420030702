package Strings;
import java.util.Scanner;
public class MultipleStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str = "Procastination";
        String str1 = "hello";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,3));
        System.out.println(str.startsWith("P"));
        System.out.println(str.endsWith("n"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(String.valueOf(str));
        System.out.println(str.equals(str));
        System.out.println(str.equalsIgnoreCase(str));
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.contains("cast"));
        System.out.println(str.trim());
        System.out.println(str.replace("c","l"));
        System.out.println(str.replaceAll(str, str1));
        
        
        
        
        
        
        
	}

}
