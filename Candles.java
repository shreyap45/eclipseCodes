package array1;
import java.util.*;

public class Candles {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int c [] = new int [n];
		    for(int i = 0; i < n ; i++){
		        c[i] = sc.nextInt();
		    }
		    Arrays.sort(c);
		   int max = 0;
		    int count = 0;
		    for (int i = 0; i <n; i++){
		        if (c[i] > max ){
		         max  = c[i];
		        }
		     while (c[i] > max) 
		            { 
		                count++; 
		            }
		        } 
		        System.out.println(count);
	}

}
