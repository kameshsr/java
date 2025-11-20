public class Dead{
    public static void main(String[] args){
        String resoursce1 = "resource1";
        String resoursce2 = "resource2";
        Thread t=new Thread(
                ()->{
                    synchronized(resoursce1){
                        try{
                            System.out.println("Thread 1 ");
                            Thread.sleep(100);
                        }
                        catch(Exception ignored){}
                        synchronized(resoursce2){
                            System.out.println("Thread 1 locked resource 2");
                        }
                    }
                }
        );

        Thread t2= new Thread(
                ()->{
                    synchronized(resoursce2){
                        try{
                            System.out.println("Thread 2 ");
                            Thread.sleep(100);
                            
                        }catch(Exception e){}
                        synchronized(resoursce1){
                            System.out.println("Thread 2 locked resource 1");
                        }
                    }
                }
        );
        t.start();
        t2.start();
    }
}