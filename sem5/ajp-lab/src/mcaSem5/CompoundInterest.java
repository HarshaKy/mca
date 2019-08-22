package mcaSem5;

import java.util.*;

public class CompoundInterest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle, rate, time;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter P, T, R values: ");
		principle = sc.nextDouble();
		rate = sc.nextDouble();
		time = sc.nextDouble();
		
		double ci = principle * 
                (Math.pow((1 + rate / 100), time)); 
		
		sc.close();
		
		System.out.println("Compound Interest is "+ ci);

	}

}
