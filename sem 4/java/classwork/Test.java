class Parent {
  int m;

  Parent(int a) {
    System.out.println("Parent constructor.");
    this.m = a;
    System.out.println(this.m);
  }
}

class Child extends Parent {
  int x;

  Child() {
    // System.out.println("Child constructor");
    this(10, 20);
    // super();
    System.out.println("child 0 args constructor");
  }

  Child(int a, int b) {
    super(b);
    System.out.println("child 2 argument constructor");
    this.x = b;
  }
}

public class Test { // public class must have same name as .java file
  public static void main(String[] args) {
    Child c = new Child();
    // Parent p = new Parent();
  }
}

// if user is defining constructor inside the class, there wont be a default
// constructor created
