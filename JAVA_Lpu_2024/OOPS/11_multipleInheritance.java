package OOPS;
interface A{
    void show();
}
interface B{
    void display();
}
class C implements A,B{
    public void show(){
        System.out.println("Showing");
    }
    public void display(){
        System.out.println("Displaying");
    }
}

class multipleInheritance {
    public static void main(String[] args){
        C obj = new C();
        // obj.show();
        obj.display();
    }
}
