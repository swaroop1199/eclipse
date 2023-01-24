package javaproject;

public class demo {
	
	int a;
	int b;
	int c;
	
	demo(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Constructor is Executed");
	}

	demo(){
		a = 2;
		b = 100;
		c = 100;
	}
	
	
	public static void display() {
		System.out.println("Swaroop");
	}
	
	void displayname() {
		System.out.println("Swaroop");
	}
	
	void displayname(int p) {
		System.out.println("Swa"+p);
	}
	
	
	
	

	
}
