package Task1;

/**
 * Jacket is extending class Equip and add quantity of pockets
 * 
 * @author user
 *
 */
public class Jacket extends Equip {
	int pockets = 3;

	public Jacket(String Name, int price, int weight) {
		this.label = Name;
		this.price = price;
		this.weight = weight;
	}

	public void setPockets(int n) {
		pockets = n;
	}
}