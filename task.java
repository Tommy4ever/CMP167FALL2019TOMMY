/**
 * 
 * @author Tommy
 *
 */
import java.io.StringWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class task {
	public static void main(String[] args) {

	StringWriter sw = new StringWriter();
	PrintWriter pw = new PrintWriter (sw);
	
	pw.print("Hungry");
	
	String name = sw.toString();
	
	System.out.println(name);
	
	 String myWords = "Tommy  26";
	 Scanner in = new Scanner(myWords);
	 
	 String name1 = in.next ();
	 int age = in.nextInt();
	 
	 System.out.printf("%s is %d years old", name1, age);
	 
	 
	 
	
	
	
	
 }
 }