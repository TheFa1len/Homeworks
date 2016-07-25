package Module1;

/**
 * Helmet is extending class Equip and add boolean type of visor existing
 * 
 * @author user
 *
 */
public class Helmet extends Equip {
	boolean visor = true;

	public Helmet(String name, int price, int weight) {
		this.label = name;
		this.price = price;
		this.weight = weight;
	}

	public void setVisor(boolean status) {
		visor = status;
	}
}
