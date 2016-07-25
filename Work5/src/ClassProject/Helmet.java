package ClassProject;
public class Helmet extends Equip {
	boolean visor = true;
	public Helmet (String name, int price, int weight){
		this.label = name;
		this.price = price;
		this.weight = weight;
	}
	public void SetVisor (boolean status){
		visor = status;
	}
}
