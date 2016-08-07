package Task4;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * Class of customer, with queue rules
 * 
 * @author DEN
 *
 */
public class Customer implements Runnable {

	public int custNum;
	public int goods;
	public int worker_assigned;

	Customer(int custNum) {
		this.custNum = custNum;
	}

	@Override
	public void run() {
		custСreated();
		wait(Shop.maxCapacity);
		cust_enterShop();
		wait(Shop.workerDesk);
		wait(Shop.mutex);
		enqueue(custNum);
		signal(Shop.custReady);
		signal(Shop.mutex);
		wait(Shop.coord);
		custRequest();
		signal(Shop.coord2);
		wait(Shop.finished[custNum]);
		leave();
		signal(Shop.leave_workerDesk);
		signal(Shop.maxCapacity);
		Shop.count++;
	}

	void leave() {
		System.out.println("Customer " + custNum + " leaves shop");
	}

	void custRequest() {
		System.out.println(
				"Customer " + custNum + " asks cashier " + worker_assigned + " to serve him with " + goodsName(goods));
	}

	/**
	 * generating list of customer goods
	 * 
	 * @param goods
	 * @return
	 */
	private String goodsName(int goods) {
		String list = new String();
		switch (goods) {
		case 1:
			list = "coockies, milk, cornflakes";
			break;
		case 2:
			list = "meat, veagetables, oil";
			break;
		case 3:
			list = "smthing else";
			break;
		}
		return list;
	}

	void enqueue(int custId) {
		Shop.queue.add(custId);
	}

	void custСreated() {
		System.out.println("Customer " + custNum + " created");
		Random r = new Random();
		int low = 1;
		int high = 4;
		this.goods = r.nextInt(high - low) + low;
	}

	void wait(Semaphore s) {
		try {
			s.acquire();
		} catch (InterruptedException e) {

		}
	}

	void cust_enterShop() {
		System.out.println("Customer " + custNum + " enters shop");
	}

	void signal(Semaphore s) {
		s.release();
	}
}