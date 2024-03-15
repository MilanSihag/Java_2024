package Threads;
class A extends Thread{
    public void run(){
        for(int i = 0;i <= 10;i++){
            System.out.println("shoeing A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0;i <= 10;i++){
            System.out.println("Showing B");
        }
    }
}
class threads {
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();
        obj1.setPriority(Thread.MAX_PRIORITY);
        // obj2.setPriority(6);
        obj1.start();
        obj2.start();
        // System.out.println(obj1.getPriority());
        // System.out.println(obj2.getPriority());
    }
}
