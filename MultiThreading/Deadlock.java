//an example of deadlock
class A{
    synchronized void foo(B b){
        String name =Thread.currentThread().getName();
        System.out.println(name+" entered a foo thread");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("a thread interrupted");
        }
        System.out.println("trying to call b.last");
        b.last();
    }
    synchronized void last(){
        System.out.println("inside a .last");
    }
}
class B{
    synchronized void bar(A a){
        String name=Thread.currentThread().getName();
        System.out.println(name+" entered a thread");
        try{

            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(name+" interrupted");
        }
        System.out.println("trying to call a.last");
        a.last();
    }
    synchronized void last(){

        System.out.println("inside b.last");
    }
}
class Deadlock implements Runnable{
    A a =new A();
    B b = new B();
    Thread t;
    Deadlock(){
        Thread.currentThread().setName("main thread");
        t = new Thread(this,"racing thread");
    }
    void deadlockstart(){
        t.start();
        a.foo(b);
        System.out.println("back in main thread");
    }
    public void run(){
        b.bar(a);
        System.out.println("back in other thread");
    }
    public static void main(String args[]){
        Deadlock d= new Deadlock();
        d.deadlockstart();
    }
}