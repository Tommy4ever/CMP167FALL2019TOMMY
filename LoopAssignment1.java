import java.util.Scanner;
public class LoopAssignment1 {
public static void main(String[]args) {
	Scanner scnr = new Scanner (System.in);
	
int n ;
int i;

System.out.println("Enter value for n");
n = scnr.nextInt();


for (i=1 ;i <= n; i++) {
	
	System.out.println(i*i);
}
System.out.println("Sum of 'n' and a number(6): " + (n+6));	

System.out.println("Sum of all #s to 'n': " + (i+n));	
	
	
	
		
	}

}
