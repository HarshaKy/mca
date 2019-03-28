abstract class Functionalities {
	void create() {
		System.out.println("Created a word file.");
	}

	void read(){
		System.out.println("reading any existing file.");
	}

	void update(){
		System.out.println("updating an existing file.");
	}

	void delete(){
		System.out.println("deleting an existing file");
	}

	abstract void special();
}

class HomePc extends Functionalities {

	void special() {
		System.out.println("Here goes pc's special properties");
	}
}

class WebServer extends Functionalities {

	void special() {
		System.out.println("Here goes WebServer's special properties");
	}
}

class Phone extends Functionalities {

	void special() {
		System.out.println("Here goes Phone's properties");
	}
}

class MainClassComputer {
	public static void main(String[] args) {
		HomePc h = new HomePc();
		WebServer w = new WebServer();
		Phone p = new Phone();

		h.create();
		h.read();
		h.update();
		h.delete();
		h.special();

		w.create();
		w.read();
		w.update();
		w.delete();
		w.special();

		p.create();
		p.read();
		p.update();
		p.delete();
		p.special();
	}
}
