class Deadlock implements Runnable{
    Thread t;
    DeadOne d1=new DeadOne();
    DeadTwo d2=new DeadTwo();
    Deadlock(){
        t=new Thread(this,"main");
    }
    void deadlockstart(){
        t.start();
        d1.foo(d2);
    }
    public void run(){
        d2.bar(d1);
    }
    public static void main(String args[]){
        Deadlock d=new Deadlock();
        d.deadlockstart();

    }
}


class DeadOne {
    synchronized void foo(DeadTwo d){
        try{
            System.out.println("in Deadone");
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Deadone interrupted");
        }
        System.out.println("trying to call DeadTwo.last()");
        d.last();
    }
    synchronized void last(){
        System.out.println("I am deaone last");
    }
}

class DeadTwo{
    synchronized void bar(DeadOne d){
        try{
            System.out.println("in DeadTwo");
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("interrupted class deadtwo");
        }
        System.out.println("calling deadone last method");
        d.last();
    }
    synchronized void last(){
        System.out.println("I am last");
    }
}


