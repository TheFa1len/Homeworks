package Module1;

/**
 * Gloves is extending class Equip and add material of equipment
 * 
 * @author user
 *
 */
public class Gloves extends Equip {
	String material = "Leather";

	public Gloves(String name, int price, int weight) {
		this.label = name;
		this.price = price;
		this.weight = weight;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
