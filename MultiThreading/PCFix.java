class Q{
    int n;
    boolean valueSet =false;
    synchronized int get(){
        while(!valueSet){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("get method interrupted");
            }
        }
        valueSet=false;
        notify();
        System.out.println("Got"+n);
        return n;
    }
    synchronized void put(int n){
        while(valueSet){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("put interupted");
            }
        }
        this.n=n;
        valueSet=true;
        System.out.println("put"+n);
        notify();
    }
}
class Producer implements Runnable{
    Q q;
    Thread t;
    Producer(Q q){
        this.q=q;
        t = new Thread(this, "Producer");
    }
    public void run(){
        int i=0;
        while(true){
            q.put(i++);
        }
    }
}
class Consumer implements Runnable{
    Q q;
    Thread t;
    Consumer(Q q){
        this.q=q;
        t = new Thread(this,"consumer");
    }
    public void run(){
        while(true){
            q.get();
        }
    }
}
class PCFix{
    public static void main(String args[]){
        Q q = new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);
        producer.t.start();
        consumer.t.start();
        System.out.println("press ctrl c to terminate");
    }
}