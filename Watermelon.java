package maths;
import java.util.*;
public class Watermelon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		
		if (w%2==0) {
			if (w==2) {
				System.out.println("NO");
			}
			
		    if ((w/2) % 2 == 0) {
			System.out.println("YES");
	    	}
		        }
		else {
			System.out.println("NO");
		}
	}
}
