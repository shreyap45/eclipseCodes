package array1;
import java.util.*;

public class SumMinMax {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	         int[] a = new int[5];

	        for (int i = 0; i < 5; i++) {
	           a [i] = scanner.nextInt();
	        }
	        Arrays.sort(a);
	        int max = 0;
	        int min = 0;
	        for (int i = 0; i<= 3; i++) {
	        	min = min + a[i];
	        }
	        for (int i = 1; i <= 4; i++) {
	        	max = max + a[i];
	        }
	        System.out.println(min+ " " +max);
	}

}
