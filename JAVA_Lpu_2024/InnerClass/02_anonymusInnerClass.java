package InnerClass;
class A{
    void print(){
        System.out.println("From A");
    }
}
// class B extends A{
//     void print(){
//         System.out.println("From B");
//     }
// }
class anonymusInnerClass {
    public static void main(String[] args){
        A obj = new A(){
            void print(){ //we use this to override anything just for once
                System.out.println("From main");
            }
        };
        obj.print();
        A obj1 = new A();
        obj1.print();
    }    
}
