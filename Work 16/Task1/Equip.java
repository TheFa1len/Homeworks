package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Abstract class that describe all types of equipment that can be used be
 * motorcyclists
 * 
 * @author user
 *
 */
abstract public class Equip implements Wear {
	protected int price = 0;
	protected String label;
	protected int weight = 0;

	public Equip() {
		price = 100;
		weight = 10;
		label = "ivanov";
	}

	public Equip(String name, int price, int weight) {
		this.label = name;
		this.price = price;
		this.weight = weight;
	}

	public void setPrice(int n) {
		price = n;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.label = name;
	}

	public String getName() {
		return label;
	}

	public void setWeight(int w) {
		weight = w;
	}

	public int getWeight() {
		return weight;
	}

	public String toString() {
		return label + " " + price;
	}

	@Override
	public void wearMsg() {
		Locale loc = Locale.getDefault();
		ResourceBundle rb = ResourceBundle.getBundle("Resources/MessagesBundle", loc);
		System.out.println(rb.getString("wearMsg1") + " " + percent + " " +  rb.getString("wearMsg2"));
	}

	/**
	 * Method that sort equipment by weight taking them from list of
	 * motorcyclist
	 * 
	 * @param mList
	 */
	public static void sortWeightList(List<Motorcyclist> mList) {
		Locale loc = Locale.getDefault();
		ResourceBundle rb = ResourceBundle.getBundle("Resources/MessagesBundle", loc);
		List<Equip> equip = new ArrayList<>();
		for (Motorcyclist tmp : mList) {
			equip.add(tmp.helmet);
			equip.add(tmp.gloves);
			equip.add(tmp.jacket);
		}
		Collections.sort(equip, new Comparator<Equip>() {// making default class
															// of comparator
			public int compare(Equip o1, Equip o2) {
				return Integer.compare(o1.weight, o2.weight);
			}
		});
		for (Equip tmp : equip) {
			System.out.println(rb.getString("sort1")+ " " + tmp.label + " - " + tmp.weight);
		}
	}

}