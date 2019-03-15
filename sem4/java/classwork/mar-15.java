interface asdf {
    int x = 1, y = 2;
}

class child implements asdf {
    public static void main(String[] args) {
        System.out.println(x + " " + y); // variables have to be initialized in the interface for this to work.
    }
}