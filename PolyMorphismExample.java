class Demonstration {
    public static void main( String args[] ) {
        Aircraft[] array = new Aircraft[3];
        array[0] = new BellCobraHelicopter();
        array[1] = new Boeing747();
        array[2] = new Falcon9Rocket();
      
        for(Aircraft aircraft : array){
          aircraft.fly();
        }
    }
}

abstract class Aircraft {

    public abstract void fly();
}

class BellCobraHelicopter extends Aircraft {

    public void fly() {
        System.out.println("chopper away ..");
    }
}

class Boeing747 extends Aircraft {

    public void fly() {
        System.out.println("Boeing takes off.");
    }
}

class Falcon9Rocket extends Aircraft {

    public void fly() {
        System.out.println("Rocket blasts off..");
    }
}
