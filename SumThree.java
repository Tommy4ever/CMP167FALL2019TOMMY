/**
 * 
 * @author T. Simmons
 **/

import java.util.Scanner;
public class SumThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1-- Introduce the program
		System.out.println("Welcome, This Program\negerates" + "Product of two numbers");
		//2--Ask the user for the inputs
		System.out.println("Enter three numbers");
		//3--Wait for the users inputs and store
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		//4--Calculate
		int result = num1+num2+num3;
		//5-- Displayresult
		System.out.println("Result is " + result);

	
	}
	}