import java.util.Scanner;

interface Treatment {
	public void inPatient();
	public void outPatient();
}

class Hospital implements Treatment {
	public void inPatient() {

	}

	public void outPatient() {

	}
}

class Doctor extends Hospital {
	
	
	public void outPatient() {
		// this.doctorName = doctorName;
		// this.patientName = patientName;

		System.out.println("Patient is being treated as an out-patient");
	}
}

class Surgeon extends Hospital {

	public void inPatient() {
		// this.doctorName = doctorName;
		// this.patientName = patientName;	

		System.out.println("Patient is being treated as an in-patient");
	}
}

class Main {
	public static void main(String[] args) {
		Doctor doc = new Doctor();
		Surgeon sur = new Surgeon();

		// System.out.println("Enter patient name: ");
		Scanner sc = new Scanner(System.in);
		// String patientName = sc.nextLine();

		System.out.println("1. In patient 2.Out patient");
		int choice = sc.nextInt();

		if (choice == 1) {
			sur.inPatient();
		} else if (choice == 2) {
			doc.outPatient();
		} else {
			System.out.println("Wrong input.");
		}

	}
}