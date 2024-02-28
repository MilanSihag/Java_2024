package OOPS;
class A{
    public void method(){
        System.out.println("From A");
    }

}
class B extends A{}
class polymorphism {
    public static void main(String[] args){
        //upcasting
        //if the reference varible of parent class refer to object of child class
        A obj = new B(); 
        obj.method();
    }
}
