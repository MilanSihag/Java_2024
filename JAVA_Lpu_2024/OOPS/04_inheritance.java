package OOPS;
class Car{
    int wheels = 4;
    public void num_wheels(){
        System.out.println("It has four wheels");
    }
}
class Audi extends Car{
    String color = "Red";
    void description(){
        System.out.println("It is red in color");
    }
}
//Java does not support multiple inheritance
//it supports multilevel, hierarchial inheritance
class inheritance {
    public static void main(String[] args){
        Audi c1 = new Audi();
        c1.num_wheels();
        c1.description();
    }    
}
