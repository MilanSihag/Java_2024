package Threads;
//We do this in case we want to execute multiple inheritance
class A implements Runnable{
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
class B implements Runnable{
    public void run(){
        for(int i = 0;i <= 10;i++){
            System.out.println("Showing B");
        }
    }
}
class runnable {
    public static void main(String[] args){
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
