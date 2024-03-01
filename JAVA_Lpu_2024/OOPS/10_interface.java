package OOPS;
interface Food{ //it is similar to abstraction
    //everything inside this class is abstract
    void eat();
}
class Non_veg implements Food{
    public void eat(){
        System.out.println("non veg eating");
    }
}
class Veg implements Food{
    public void eat(){
        System.out.println("only eat veg");
    }
}
class Dog{
    void eating(Food obj){
        obj.eat();
    }
}
class Interface{
    public static void main(String[] args){
        Food obj = new Veg();
        Food obj1 = new Non_veg();
        Dog d1 = new Dog();
        d1.eating(obj);
        d1.eating(obj1);
    }
}
