package ClassProject;

public class Jacket extends Equip {
	int pockets = 3;
	public Jacket (String Name, int price, int weight){
		this.label = Name;
		this.price = price;
		this.weight = weight;
	}
	public void SetPockets(int n){
		pockets = n;
	}
}
