// interface asdf {
// 	int x = 1, y = 2;
// }

// class child implements asdf {
// 	public static void main(String[] args) {
// 		System.out.println(x + " " + y); // variables have to be initialized in the interface for this to work.
// 	}
// }

interface asdf { // interfaces cant be final. interfaces also can't have constructors.
	int x = 10; 
	public void show();
}

class child implements asdf {
	public void show() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		child c = new child();
		c.show();	
	}
}