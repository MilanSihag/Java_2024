class A{
    public A(){
        System.out.println("From A");
    }
    public A(int n){
        System.out.println("from A int");
    }
}
class B extends A{
    public B(){
        this(2); //it will call the other constructors of the same class
        System.out.println("From B");
    }
    public B(int n){
        super(n); //this will invoke the parameterised constructor of super class having same signature
        System.out.println("From B int");
    }
}
//every constructor has a builtin super which will call the constructor of parent class/super class
class Lpu{

    public static void main(String[] args){
        B obj1 = new B(4);
    }
}