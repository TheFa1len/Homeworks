package Task4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 * Class describing cashier of shops
 * 
 * @author DEN
 *
 */
public class Cashier implements Runnable {

	public int cashierNum;
	public static Queue<Integer> cashierQueue = new LinkedList<>();
	private int next_cust_number;

	Cashier(int workerNum) {
		this.cashierNum = workerNum;
	}

	@Override
	public void run() {
		workCreated();
		while (true) {
			wait(Shop.custReady);
			wait(Shop.mutex);
			dequeue();
			signal(Shop.mutex);
			signal(Shop.coord);
			wait(Shop.coord2);
			serveCust();
			signal(Shop.finished[next_cust_number]);
			wait(Shop.leave_workerDesk);
			signal(Shop.workerDesk);
		}
	}

	/**
	 * Serving our customer
	 */
	void dequeue() {
		next_cust_number = Shop.queue.remove();
		System.out.println("Cashier " + cashierNum + " serving Customer " + next_cust_number);
		Shop.objCust[next_cust_number].worker_assigned = cashierNum;
	}

	void workCreated() {
		System.out.println("Cashier " + cashierNum + " created");
	}

	void signal(Semaphore s) {

		s.release();

	}

	/**
	 * finishing serving
	 */
	void serveCust() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println("Cashier " + cashierNum + " finished serving customer " + next_cust_number);
	}

	void wait(Semaphore s) {
		try {
			s.acquire();
		} catch (InterruptedException e) {

		}
	}
}
