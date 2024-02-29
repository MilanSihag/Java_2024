package InnerClass;
class A{
    void test1(){
        System.out.println("From A");
    }
    static class B{
        void test2(){
            System.out.println("from B");
        }
    }
}
class intro {
    public static void main(String[] args){
        // A obj1 = new A();
        // A.B obj2 = obj1.new B();//non static inner class
        A.B obj2 = new A.B();//static inner class
        obj2.test2();
    }    
}
