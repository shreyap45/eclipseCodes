package String;
import java.util.*;

public class Password {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
	      String s = sc.next();
	       for (int i = 0; i<n; i++){
	           if (n<6){
	               System.out.println(6-n);
	           }
	           char a = s.charAt(i);
	           
	             if(!s.equals(Character.isUpperCase(a))){
	               System.out.println("1");
	             }
	             if (!s.equals(Character.isLowerCase(a))) {
	            	 System.out.println("1");
	             }
	             if (!"0123456789".equals(a)) {
	            	 System.out.println("1");
	             }
	             if(!"!@#$%^&*()-+".equals(a)) {
	            	 System.out.println("1");
	             }
          }
	}
	
}
