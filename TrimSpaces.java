package array1;
import java.util.*;

public class TrimSpaces {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int t = sc.nextInt();
	 sc.nextLine();
	for (int i = 1; i<= t; i++) {
		
		String s = sc.nextLine();
		
		s = s.replace(" ","");
		
		System.out.println(s);
	}
}
}
