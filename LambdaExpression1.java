class Demonstration {
    public static void main( String args[] ) {
      
      DoStuff ds1 = ()-> System.out.println("I ran via lambda expression");
      DoStuff ds2 = new DoStuff() {
        public void work() {
          System.out.println("I ran via anonymous class");
        }
      };
      ds1.work();
      ds2.work();
    }
}

// A functional interface
interface DoStuff {
  void work();
}
