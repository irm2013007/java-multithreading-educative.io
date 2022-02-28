class Demonstration {
    public static void main( String args[] ) {
        (new MultiLingual()).sayHello();
    }
}

interface Language {

    void sayHello();
    
}

interface Punjabi extends Language {

    String lang = "punjabi";

    default void sayHello() {
        System.out.println("O Kiddaan");
    }

}

interface Marathi extends Language {

    String lang = "Marathi";

    default void sayHello() {
        System.out.println("Namaskaar");
    }

}

class MultiLingual implements Punjabi, Marathi {

    // Must provide implementation for the sayHello
    // method, otherwise the code will not compile
    // even though both the interfaces provide 
    // default implementations
    // UNCOMMENT THE BELOW METHOD FOR SUCCESSFUL COMPILATION
    /*public void sayHello() {
        System.out.println("I forgot how to say hello in both " + Marathi.lang  + " & " + Punjabi.lang);
    }*/
}
