package javaproject;

public class development {

	public static void main(String[] args) {
		
		classtwo c = new classtwo();
		c.carstart();
		//c.carstop();
		c.bikestart();
		c.trainstart();
		
		classone<String> o = new classone<String>("Hello");
		System.out.println(o.getvalue());
		}
	
	}



