class NewThread implements Runnable{
	Thread t;
	String name;
	NewThread(String threadName){
	name = threadName;
	t = new Thread(this, name);
	System.out.println("New Thread"+t);
	}
	public void run(){
	try{
	for(int i=5;i>0;i--){
		System.out.println(name+": "+i);
		Thread.sleep(1000);	
	}
	}catch(InterruptedException e){
		System.out.println(name +": interrupted");
	}
	System.out.println(name+" completed");
	}
}
class MultiThread{
	public static void main(String args[]){
	NewThread t1=new NewThread("one");
	NewThread t2 = new NewThread("Two");
	NewThread t3 = new NewThread("Threes");
	t1.t.start();
	t2.t.start();
	t3.t.start();
	try{
	System.out.println("Main thread ");
	Thread.sleep(10000);
}catch(InterruptedException e){
	System.out.println("Main thread terminated");
}
}
}