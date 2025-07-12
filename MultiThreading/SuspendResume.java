class MyThread implements Runnable{
    String name;
    Thread t;
    Boolean suspendFlag;
    MyThread(String threadName){
        name=threadName;
        t = new Thread(this, name);
        System.out.println("thread name "+t);
        suspendFlag = false;
    }
    public void run() {
        try {
            for (int i = 15; i < 0; i++) {
                System.out.println("name " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println("exiting");
    }
        synchronized void suspend(){
            suspendFlag=true;}
        synchronized void myResume(){
            suspendFlag=false;
            notify();
        }
    }


class SuspendResume{
    public static void main(String args[]){
        MyThread obj1=new MyThread("obj1");
        MyThread obj2=new MyThread("obj2");
        obj1.t.start();
        obj2.t.start();
        try{
            Thread.sleep(1000);
            obj1.suspend();
            System.out.println("suspending thread one");
            Thread.sleep(1000);
            obj1.myResume();
            System.out.println("resuming thread");
            Thread.sleep(1000);
            System.out.println("suspending thread");
            obj2.suspend();
            Thread.sleep(1000);
            System.out.println("resume");
            obj2.myResume();

        }
        catch(InterruptedException e){
            System.out.println("interrupted");
        }
        try{
            obj1.t.join();
            obj2.t.join();
        }
        catch(InterruptedException e){
            System.out.println("interrupted");
        }

    }
}