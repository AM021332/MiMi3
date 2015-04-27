public class Question3{
	public statis void main(String[] args){
		
	}
}
class ThreadA extends Thread{
	public void run(){
		for(int i = 0 ; i < 1000 ; i++){
			System.out.println("ThreadA");
			try{
				this.sleep(1000);
			} catch( Exception e){
				System.out.println(e);
			}
		}
	}
}