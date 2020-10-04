package array1;
import java.util.*;
public class PlusMinus {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a [i] = sc.nextInt();
        }
        int e=0, b=0;
        int c = 0;

       for (int i = 0; i<n; i++){
             if (a[i] > 0){
              e++;
             }

                if (a[i] <0){
                   b++;
                }
            
               if (a[i] ==0){
                   c++;
               }
       }
        System.out.println();
        System.out.println();
        System.out.println();
        
	}

}
