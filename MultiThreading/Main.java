//controlling the main thread
public class Main{
    public static void main(String args[]){
        Thread t = Thread.currentThread();
        System.out.println("current Thread"+t);
        t.setName("kamesh");
        System.out.println(t);
        try{
            for(int n=5;n>0;n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
    }
}
/*
output:
current ThreadThread[#1,main,5,main]
Thread[#1,kamesh,5,main]
5
4
3
2
1

 */