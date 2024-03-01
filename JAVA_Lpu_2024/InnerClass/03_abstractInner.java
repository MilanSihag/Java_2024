package InnerClass;
abstract class A{
    abstract void print();
}
class abstractInner {
    public static void main(String[] args){
        A obj  = new A() {
            void print(){
                System.out.println("from main");
            }
        };
        obj.print();
    }
}
