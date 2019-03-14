abstract class FormLayout {


	abstract void formProperties();


}

abstract class Button extends FormLayout{
	String formName, outline, edge, font, style, colorFill, caption;
	int fontSize;
	double width, height;

	abstract void buttonCaption();

	public void buttonProperties() {
		this.outline = "Black";
		this.edge = "Round";
		this.colorFill = "Green";
		this.height = 1;
		this.width = 4;
		this.fontSize = 11;
		this.style = "Bold";
		this.font = "Verdana";
	}

	public void displayForm() {
		System.out.println("Form Name: " + this.formName);
		System.out.println("---------Button Properties------------");
		System.out.println("Outline: " + this.outline + " Edge: " + this.edge);
		System.out.println("Font: " + this.font + " Style: " + this.style + " Caption: " + this.caption);
		System.out.println("Color: " + this.colorFill);
	}
}


class Reservation extends Button {

	void formProperties() {
		this.formName = "Reservation Page";
	}

	void buttonCaption() {
		this.caption = "Reserve";
	}
}

class CancelRes extends Button {

	void formProperties() {
		this.formName = "Cancellation Page";
	}


	void buttonCaption() {
		this.caption = "Cancel Reservation";
	}


}

class MainClass {
	public static void main(String[] args) {
		Reservation r = new Reservation();
		r.formProperties();
		r.buttonProperties();
		r.buttonCaption();


		r.displayForm();
		System.out.println("--------------------------");


		CancelRes c = new CancelRes();
		c.formProperties();
		c.buttonProperties();
		c.buttonCaption();

		c.displayForm();
	}
}
