package array1;
import java.util.*;
public class CompareTriplets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the fucking score of Alice and Bob respectively : ");
		
	    	int a [] = new int [3];
		    int b [] = new int [3];
			
			 for (int i = 0; i<3; i++) {
		            a[i] = sc.nextInt();
		            }
		          for (int i = 0; i<3; i++) {   
		            b[i] = sc.nextInt(); 
		            }   
		          int alice = 0;
			    	int bob = 0;
		         
		          for (int i = 0; i<3; i++) {
		         
		             if (a[i] > b[i]) 
		                alice = alice +1 ;
		            
		            else if (a[i] < b[i]) 
		                bob = bob + 1;
		        }
           
//			   alice = ((a[0]>b[0])?1:0)+ ((a[1]>b[1])?1:0)+ ((a[2]>b[2])?1:0) ;
//
//	             bob = ((a[0]<b[0])?1:0)+ ((a[1]<b[1])?1:0)+ ((a[2]<b[2])?1:0) ;
	             
		
		System.out.println("[" + alice + "," + bob + "]");
		
	
}
}
