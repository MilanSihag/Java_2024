package OOPS;
abstract class Car {
    abstract void acceleration();
    void playMusic(){
        //concrete method
    }
}
class Ford extends Car{
    void acceleration(){
        System.out.println("Car is speeding up");
    }
}
class abstraction {
    public static void main(String[] args){
        Ford f1 = new Ford();
        Car obj = new Ford();//upcasting
        // f1.acceleration();
        obj.playMusic();
    }
}
