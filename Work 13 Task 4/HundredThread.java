package Task4;
//Two threads that counting from  1 to 100 with 10 numbers in line
public class HundredThread {

	public static void main(String[] args) {
		MainThread th = new MainThread ("First");
		SecondThread tr = new SecondThread ("Second");
		th.start();
		tr.start();
	}
}
