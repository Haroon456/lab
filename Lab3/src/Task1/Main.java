package Task1;

public class Main extends Thread{
	public void run() {
		System.out.println("Task One");
	}
	public static void main(String args[]) {
		Main t1 = new Main();
		Main t2 = new Main();
		Main t3 = new Main();
		Main t5 = new Maint();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
