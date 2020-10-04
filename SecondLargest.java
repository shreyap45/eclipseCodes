package Java;
import java.util.*;

public class SecondLargest {
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-->0){
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          int result = 0;
             
     if(a < b && b < c){
        	  System.out.println(b );
          }
      
          else if (a<b && a>c){
              System.out.println(a);
          }
          else if (c<b && c>a){
              System.out.println(c);
          }
      }
	}

}
