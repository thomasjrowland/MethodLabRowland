package MethLab;

import java.util.Scanner;

public class MethLabRowland {
	
	private static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		
		capitalize("rOWLAND");
		wheresWaldo("Who is Waldo?");
		firstThingsFirst("omega" , "alpha");
		reverse("Hello");	
		soLong("ABC", "ABCD");
		afterMath("Something math something or other");
		letterize("TOM");
	}
		
	public static void capitalize(String a) {
		System.out.println(a.toUpperCase().substring(0, 1) + a.toLowerCase().substring(1));
	}
	
	public static void wheresWaldo(String b) {
		System.out.println(b.indexOf("Waldo"));
	}
	
	public static void firstThingsFirst(String c, String d) {
		if (c.charAt(0) > d.charAt(0)) {
			System.out.println(d + " " + c);
		} else {
			System.out.println(c + " " + d);
		}
	}
	
	public static void reverse (String e) {
		String output = "";
		for(int i = e.length()-1; i >=0; i--) {
			
			output = output + e.charAt(i);
		}
		System.out.println(output);
	}
		
	public static void soLong(String f, String g) {
		
		if (f.length() > g.length()) {
			System.out.println(f);
		} else if (f.length() < g.length()) {
			System.out.println(g);
		} else {
			System.out.println(f + " " + g);
		}
		
	}
	
	public static void afterMath(String f) {
		int n = f.indexOf("math");
		if (n != -1) {
		System.out.println(f.substring(n));
		} else {
			System.out.println("dud");
		}
	}

	public static void letterize(String g) {
		
		for (int i = 0 ; i < g.length() ; i++) {
			System.out.println(g.charAt(i));
			
		}
		
	}

}