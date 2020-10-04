package Java;
import java.util.*;
import java.lang.Math; 
import java.io.*;

public class Series {


    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int q = in.nextInt();
         int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        int s =0;
        int v =0;
        
        System.out.print(a);
        for(int i=1;i<t;i++){
        	
           s = (int)(Math.pow(q,i)) ;
            v = b*s;
            
            System.out.print(v +" " );
            }
          	   System.out.println();
       }
        }



