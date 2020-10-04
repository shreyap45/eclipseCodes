package String;
import java.util.*;

public class CamelCase {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	sc.nextLine();
	
	for (int i = 1; i<=t; i++) {
		String s = sc.nextLine();
		for (int j = 0; j< s.length(); j++) {
			
	         if(Character.isUpperCase(s.charAt(j))) {
	             System.out.print(s.charAt(j));
	         }
	       }
		}
		
	}
	
	}
