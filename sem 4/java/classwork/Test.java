class Parent {
  Parent(int a) {
    System.out.println("Parent constructor.");
  }
}

class Child extends Parent {
  Child() {
    // System.out.println("Child constructor");
    this(10);
    System.out.println("child 0 args constructor");
  }

  Child(int a) {
    System.out.println("child 1 argument constructor");
  }
}

public class Test { // public class must have same name as .java file
  public static void main(String[] args) {
    Child c = new Child();
    // Parent p = new Parent();
  }
}
