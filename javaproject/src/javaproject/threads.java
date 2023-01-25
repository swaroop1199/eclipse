package javaproject;

public abstract class threads implements Runnable {
	
	String name;
	Thread t;
	threads(String tname){
		name = tname;
		t = new Thread(this,name);
	}
	
	
	public void run() {
		System.out.println("Thread is running ");
	}

}
