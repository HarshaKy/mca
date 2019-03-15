// interface asdf {
// 	int x = 1, y = 2;
// }

// class child implements asdf {
// 	public static void main(String[] args) {
// 		System.out.println(x + " " + y); // variables have to be initialized in the interface for this to work.
// 	}
// }

// interface asdf { // interfaces cant be final. interfaces also can't have constructors.
// 	int x = 10; 
// 	public void show();
// 	// public void asdf(); // no constructors allowed m8.
// }

// class child implements asdf {
// 	public void show() {
// 		System.out.println(x);
// 	}

// 	public static void main(String[] args) {
// 		child c = new child();
// 		c.show();	
// 	}
// }

interface intf1 {
	public void get();
	public void put();
}

class child implements intf1 {
	public void get () {}
	public void put () {} // child should implement all methods in the parent interface.

	public static void main(String[] args) {
		child c = new child();
		c.get();
	}
}

// even interfaces are made into a .class file. 