package OOPS;
abstract class Car {
    // abstract public int a = 0; not valid
    abstract void acceleration();
    public void playMusic(){
        //concrete method
    }
}
class Ford extends Car{
    void acceleration(){
        System.out.println("Ford is speeding up");
    }
}
class Tata extends Car{
    void acceleration(){
        System.out.println("Tata is speeding up");
    }
}
class abstraction {
    public static void main(String[] args){
        Ford f1 = new Ford();
        Car obj = new Ford();//upcasting
        f1.acceleration();
        // obj.playMusic();
        Tata obj1 = new Tata();
        obj1.acceleration();
    }
}
/*Abstraction is a process of adding the implementation details and showing only functionalty to the user
 * The abstraction class must be declared with abstract key word
 * it can have abstract and concrete methods
 * it cannot be instantiated
 * if a sub class is extended from abstract class it must define the abstract method of parent class
 * abstract modifier is not valid for variable
 * abstract cannot be private
 * abstract method cannot be static
 * constructor can be created in abstract class
 */