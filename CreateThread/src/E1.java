
public class E1 extends Thread {

	public void run() {
		System.out.println("system is running...");
	}
	public static void main(String[] args) {
		E1 e=new E1();
		e.start();
	}
}
