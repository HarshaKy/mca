package mcaSem5;

import java.util.stream.DoubleStream;

public class ArraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = {1.1, 9.213, 213.1, 4.5};
		
		double sum = DoubleStream.of(arr).sum();
		
		double avg = sum/arr.length;
		
		System.out.println("average is: " + avg);

	}

}
