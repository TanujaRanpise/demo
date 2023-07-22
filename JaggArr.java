/*8. Write a program to create program for jagged array?
1 2 3
4 5 6 7
8 9 */
package Test;
import java.util.*;
public class JaggArr 
{
	public static void main(String[] args) {
      int a[][]=new int[3][];     
   		  a[0] = new int[3];      
		  a[1] = new int[4];
		  a[2] = new int[2];
     	 Scanner xyz  = new Scanner(System.in); 
       System.out.println("enter the values in matrix\n"); // enter value array.
		 for(int i=0; i<a.length; i++)
		 {
			for(int j=0; j<a[i].length;j++)
			{ a[i][j]=xyz.nextInt();
			}
		 }
		System.out.println("Display the values of matrix\n"); // display value array.
		for(int i=0; i<a.length; i++)
		 {
			for(int j=0; j<a[i].length;j++)
			{ System.out.printf("%d\t",a[i][j]);
			}
			System.out.printf("\n");
		 }
   }
}












