//controlling the main thread
public class Main{
    public static void main(String args[]){
        Thread t = Thread.currentThread();
        System.out.println("current Thread"+t);
        t.setName("kamesh");
        System.out.println(t);
    }
}
/*
output:
current ThreadThread[#1,main,5,main]
Thread[#1,kamesh,5,main]
 */