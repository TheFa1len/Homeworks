package ClassProject;
public class Gloves extends Equip{
	String material = "Leather";
	public Gloves(String name, int price, int weight) {
		this.label = name;
		this.price = price;
		this.weight = weight;
	}
	public void SetMaterial(String material){
	this.material = material;	
	}
}
	