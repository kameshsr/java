class Callme{
    void call(String msg){
        System.out.println("["+msg);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("callme interrupted");
        }
        System.out.print("]");
    }
}

class Caller implements Runnable{
    String msg;
    Callme target;
    Thread thread;
    Caller(Callme c, String s){
        target=c;
        msg=s;
        thread=new Thread(this);
    }
    public void run(){
        synchronized (target){
            target.call(msg);   
        }
    }
}
class Synch{
    public static void main(String args[]){
        Callme target = new Callme();
        Caller obj1 = new Caller(target,"caller1");
        Caller obj2 = new Caller(target, "caller2");
        Caller obj3 = new Caller(target, "caller3");
        obj1.thread.start();
        obj2.thread.start();
        obj3.thread.start();
        try{
            obj1.thread.join();
            obj2.thread.join();
            obj3.thread.join();
        }catch(InterruptedException e){

            System.out.println("main thread interrupted");
        }
        System.out.println("main thread terminated");
    }
}