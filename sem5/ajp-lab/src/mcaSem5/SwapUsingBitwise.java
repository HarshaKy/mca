package mcaSem5;

import java.util.Scanner;

public class SwapUsingBitwise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        
        a = a ^ b;        
        b = a ^ b;        
        a = a ^ b;
        
        sc.close();
        
        System.out.println("The First number after swapping: "+ a);
        System.out.println("The Second number after swapping: "+ b);

	}

}
