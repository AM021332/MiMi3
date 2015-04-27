public class Question3 {
	public static void main(String[] args) {
		Thread a = Thread.currentThread();
		new ThreadB();
		int i;
		for(i=0;i<10;i++){
			System.out.println("main()");
			try{
				a.sleep(1000);
			}catch(Exception e){}
		}
	}
}
class ThreadB implements Runnable{
	Thread c;
	ThreadB(){
		c = new Thread(this);
		c.start();
	}
	public void run(){
		int i;
		for(i=0;i<10;i++){
			System.out.println("Run!!!");
			try{
				c.sleep(1000);
			}catch(Exception e){}
		}
	}
}
