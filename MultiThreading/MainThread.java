class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t=new Thread(this,"Demo thread");
        System.out.println("child thread"+t);
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("chile thread "+i);
                Thread.sleep(500);
            }}
        catch(InterruptedException exception){
            System.out.println("child interupted");

    }
System.out.println("exiting child thread");
}
}
class MainThread{
    public static void main(String args[]){
        NewThread n = new NewThread();
        n.t.start();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main thredad "+i);
                Thread.sleep(1000);
            }}catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("exiting main thread");
    }
}