package str;

import java.util.Scanner;

public class str_manipulation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter string1 : ");
		str1=sc.nextLine();
		System.out.println("Enter string2 : ");
		str2=sc.nextLine();
		System.out.println("Character at position 2 of string1 :"+str1.charAt(2));
		System.out.println("Concating string1 and string2 : "+str1.concat(str2));
		System.out.println("Length of string2: "+str2.length());
		System.out.println("Unicode of first character in string1: "+str1.codePointAt(0));
		System.out.println("Does string1 contains 'hello': "+str1.contentEquals("hello"));
		System.out.println("Compare string1 and string2: "+str2.compareTo(str1));
		System.out.println("String2 in uppercase: "+str2.toUpperCase());
		System.out.println("String1 in lowercase: "+str1.toLowerCase());
		System.out.println("Is string1 empty?: "+str1.isEmpty());
		System.out.println("String2 after removing space: "+str2.trim());
		System.out.println("String1 after replacing : "+str1.replace('l', 'p'));
	}

}
