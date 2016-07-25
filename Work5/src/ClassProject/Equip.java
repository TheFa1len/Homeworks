package ClassProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract public class Equip implements Wear {
	protected int price = 0;
	protected String label;
	protected int weight = 0;
	public Equip (){
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
	 public int compare(Equip o1, Equip o2) {
		 String tmp1 = String.valueOf(o1.weight);
		 String tmp2 = String.valueOf(o2.weight);
         return o1.toString().compareTo(o2.toString());
 }
	

	public static void sortWeightList (List<Motorcyclist> mList){
		List<Equip> equip = new ArrayList<>();
		for (Motorcyclist tmp : mList ){
			equip.add(tmp.helmet);
			equip.add(tmp.gloves);
			equip.add(tmp.jacket);
		}
		Equip temp = null;
		/*for(int j = mList.size()-1; j > 0; j--){
			for(int i = 0 ; i < j; i++){
				if(equip.get(i).weight > equip.get(i+1).weight){
					temp = equip.get(i);
					equip.set(i,equip.get(i+1)) ;
					equip.set((i+1),temp);
	                }
	           }
	       }*/
		Collections.sort(equip, new Comparator<Equip>(){
			public int compare(Equip o1, Equip o2) {
			 String tmp1 = String.valueOf(o1.weight);
			 String tmp2 = String.valueOf(o2.weight);
	         return o1.toString().compareTo(o2.toString());
	 }
			});
	   for(	Equip tmp:equip){
		System.out.println("Sorted equip by weight " + tmp.label + " - " + tmp.weight);
	}
}
	
}

