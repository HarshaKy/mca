class NameSwap {
  public void swap(String s){
    String newS = "";
    for (int i = 0; i<s.length(); i = i + 2) {
      newS = newS + s.charAt(i+1) + s.charAt(i);
    }

    System.out.println(newS);
  }

  public static void main(String[] args) {
    NameSwap ns = new NameSwap();
    String s = "amvnnaatar";
    ns.swap(s);
  }
}
