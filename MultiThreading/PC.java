class Q{
    int n;
    synchronized int get(){
        System.out.println("Got"+n);
        return n;
    }
    synchronized void put(int n){
        this.n=n;
        System.out.println("put"+n);
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
class PC{
    public static void main(String args[]){
        Q q = new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);
        producer.t.start();
        consumer.t.start();
        System.out.println("press ctrl c to terminate");
    }
}