import java.io.*;
// unchecked exceptions

class DivZero {
	public void divide() {
		int num1 = 10;
		int num2 = 0;
		int res = 0;

		try {
			res = num1/num2;
		} catch (ArithmeticException e) {
			System.out.println("cant divide by 0. " + e);
		}
	}
}

class Arr {
	public void OutOfBound() {
		int array[] = {20,30,40};

		try {
			for (int i = 0; i <= 3; i++) {
				System.out.println("value: " + array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array out of bounds. " + e);
		}
	}
}

class StringIndex { 
	public void StringExce() { 
		try {
			String a = "asdfqwer1234";
			char c = a.charAt(12); 
			System.out.println(c); 
		}
		catch(StringIndexOutOfBoundsException e) { 
			System.out.println("string index out of bounds " + e); 
		}
	}
} 

class NumberFormat {
	public void NumFormatExce() { 
		try {
			int num = Integer.parseInt ("asdf");

			System.out.println(num); 
		} catch(NumberFormatException e) { 
			System.out.println("Number format exception " + e); 
		} 
	} 
} 

// checked exceptions

// class FileExce { 
// 	public void IOEx() throws IOException { 
// 		FileReader file = new FileReader("a.txt"); 
// 		BufferedReader fileInput = new BufferedReader(file); 
		 
// 		for (int counter = 0; counter < 3; counter++) 
// 			System.out.println(fileInput.readLine()); 
		
// 		fileInput.close(); 
// 	} 
// }

class Exce {
	public static void main(String[] args) {
		DivZero dz = new DivZero();
		Arr a = new Arr();
		StringIndex s = new StringIndex();
		NumberFormat n = new NumberFormat();
		// FileExce f = new FileExce();

		// f.IOEx();
		n.NumFormatExce();
		s.StringExce();
		a.OutOfBound();
		dz.divide();
	}
}