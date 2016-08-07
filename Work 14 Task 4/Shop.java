package Task4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 * Class of shop, describing all flags for semaphore
 * 
 * @author DEN
 *
 */
public class Shop {

	public static Semaphore maxCapacity = new Semaphore(10, true);
	public static Semaphore custReady = new Semaphore(0, true);
	public static Semaphore workerDesk = new Semaphore(3, true);
	public static Semaphore mutex = new Semaphore(1, true);
	public static Semaphore coord = new Semaphore(0, true);
	public static Semaphore leave_workerDesk = new Semaphore(0, true);
	public static Semaphore coord2 = new Semaphore(0, true);
	public static Semaphore scale = new Semaphore(1, true);
	public static int count;
	public static Queue<Integer> queue = new LinkedList<>();
	public static final int custNum = 10;
	public static final int cashierNum = 3;
	public static Semaphore[] finished = new Semaphore[custNum];

	static {
		for (int i = 0; i < custNum; i++) {
			finished[i] = new Semaphore(0, true);
		}
	}
	public static Customer[] objCust = new Customer[custNum];
	public static Cashier[] objWork = new Cashier[cashierNum];
	public static Thread[] t1 = new Thread[custNum];
	public static Thread[] t2 = new Thread[cashierNum];
}
