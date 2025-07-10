class NewThread extends Thread{
	NewThread(){
	super("Demo thread");
	System.out.println("child thread"+this);
}
	public void run(){
	try {
		for (int i = 5; i > 0; i--) {
			System.out.println("child thread " + i);
			Thread.sleep(500);
		}
	}catch(InterruptedException e){
	System.out.println("child thread interupted");
	}
	System.out.println("Exiting child thread");
}

}

class ExtendThread{
	public static void main(String args[]){
	NewThread nt=new NewThread();
	nt.start();
	try {
		for (int i = 5; i > 0; i--) {
			System.out.println("Main thread " + i);
			Thread.sleep(1000);
		}
	}catch(InterruptedException e){
	System.out.println("Main thread interrupted");
}
System.out.println("Main thread ended");
}
}
