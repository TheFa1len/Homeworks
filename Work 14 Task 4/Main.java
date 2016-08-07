package Task4;

public class Main {
	public static void main(String... args) {
		for (int i = 0; i < Shop.custNum; i++) {
			Shop.objCust[i] = new Customer(i);
			Shop.t1[i] = new Thread(Shop.objCust[i]);
			Shop.t1[i].start();

		}
		for (int i = 0; i < Shop.cashierNum; i++) {
			Shop.objWork[i] = new Cashier(i);
			Shop.t2[i] = new Thread(Shop.objWork[i]);
			Shop.t2[i].start();
		}
		for (int i = 0; i < Shop.custNum; i++) {
			try {
				Shop.t1[i].join();				
			} catch (InterruptedException e) {

			}
		}
		System.exit(0);
	}
}