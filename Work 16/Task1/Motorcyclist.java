package Task1;

import java.sql.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/*
 *  Мотоциклист.Определить иерархию амуниции. 
 *  Экипировать мотоциклиста. 
 *  Подсчитать стоимость. 
 *  Провести сортировку амуниции на основе веса. 
 *  Найти элементы амуниции, соответствующие заданному диапазону пара-метров цены.
 */
/**
 * Main class that have parameters of name, number of driver license and handled
 * equipment as helmet, jacket and gloves
 * 
 * @author user
 *
 */
public class Motorcyclist {
	protected String name;
	protected String license;
	public Helmet helmet;
	public Gloves gloves;
	public Jacket jacket;

	public Motorcyclist(String name, String license) {
		this.name = name;
		this.license = license;
	}

	/**
	 * Summary of total cost of object equioment
	 * 
	 * @return
	 */
	public int totalCost() {
		Locale loc = Locale.getDefault();
		NumberFormat valFormat = NumberFormat.getCurrencyInstance(loc);
		return helmet.price + gloves.price + jacket.price;
	}

	/**
	 * Sorting of equip weight of one object
	 */
	public void sortWeightAlone() {
		Locale loc = Locale.getDefault();
		ResourceBundle rb = ResourceBundle.getBundle("Resources/MessagesBundle", loc);
		Equip list[] = new Equip[4];
		list[0] = helmet;
		list[1] = gloves;
		list[2] = jacket;
		for (int i = 2; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (list[j].weight > list[j + 1].weight) {
					Equip tmp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = tmp;
				}
			}
		}
		System.out.println(rb.getString("sort1") + " " + list[0].label + " - " + list[0].weight + ", " + list[1].label
				+ " - " + list[1].weight + ", " + list[2].label + " - " + list[2].weight);
	}

	/**
	 * Show equipment of object in price selection
	 * 
	 * @param low
	 *            is low border of cost for selection
	 * @param high
	 *            is high border of cost for selection
	 */
	public void showIfFit(int low, int high) {
		Locale loc = Locale.getDefault();
		ResourceBundle rb = ResourceBundle.getBundle("Resources/MessagesBundle", loc);
		NumberFormat valFormat = NumberFormat.getCurrencyInstance(loc);
		
		System.out.println(rb.getString("showIfFit"));
		if (helmet.price > low && helmet.price < high)
			System.out.println(rb.getString("helmet") + " " + valFormat.format(helmet.price));
		if (gloves.price > low && gloves.price < high)
			System.out.println(rb.getString("gloves") + " " + valFormat.format(gloves.price));
		if (jacket.price > low && jacket.price < high)
			System.out.println(rb.getString("jacket") +  " " + valFormat.format(jacket.price));
	}

	/**
	 * Show equipment of list of objects in price selection
	 * 
	 * @param low
	 *            low is low border of cost for selection
	 * @param high
	 *            high is high border of cost for selection
	 * @param mList
	 *            list of Motorcyclist for sorting
	 */
	public static void showIfFitArray(int low, int high, List<Motorcyclist> mList) {
		Locale loc = Locale.getDefault();
		ResourceBundle rb = ResourceBundle.getBundle("Resources/MessagesBundle", loc);
		NumberFormat valFormat = NumberFormat.getCurrencyInstance(loc);
		System.out.println(rb.getString("showIfFit"));
		for (Motorcyclist tmp : mList) {
			if (tmp.helmet.price > low && tmp.helmet.price < high)
				System.out.println(tmp.helmet.label + " - " + valFormat.format(tmp.helmet.price));
			if (tmp.gloves.price > low && tmp.gloves.price < high)
				System.out.println(tmp.gloves.label + " - " + valFormat.format(tmp.gloves.price));
			if (tmp.jacket.price > low && tmp.jacket.price < high)
				System.out.println(tmp.jacket.label + " - " + valFormat.format(tmp.jacket.price));
		}
	}

	/**
	 * Checking allowmnet to drive bike with our drive license
	 * 
	 * @throws LicsenseException
	 */
	public void checkLicense() throws LicsenseException {
		Locale loc = Locale.getDefault();
		ResourceBundle rb = ResourceBundle.getBundle("Resources/MessagesBundle", loc);
		if (license.charAt(license.length() - 1) != 'A' && license.charAt(license.length() - 1) != 'a') {
			StringBuffer tmp = new StringBuffer(license);
			tmp.setCharAt(tmp.length() - 1, 'A');
			license = tmp.toString();
			throw new LicsenseException(name + " " + rb.getString("licenseMsg"));
		}
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getLicense() {
		return license;
	}

	public Helmet getHelmet() {
		return helmet;
	}

	public void setHelmet(Helmet helmet) {
		this.helmet = helmet;
	}

	public void setGloves(Gloves gloves) {
		this.gloves = gloves;
	}

	public Gloves getGloves() {
		return gloves;
	}

	public void setJacket(Jacket jacket) {
		this.jacket = jacket;
	}

	public Jacket getJacket() {
		return jacket;
	}

	public static void main(String[] args) {
		Locale localeRu = new Locale("ru","RU");
		Locale localeEng = new Locale("en","US");
		System.out.println("Enter lagnguage (RUS/ENG)");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		switch (s){
		case "RUS":
			Locale.setDefault(localeRu);
			break;
		case "ENG":
			Locale.setDefault(localeEng);
			break;
		default:
			System.out.println("You enter wrong locale or with mistake. We set ENG locale");
			Locale.setDefault(localeEng);
			break;
		}
		Locale loc = Locale.getDefault();
		NumberFormat valFormat = NumberFormat.getCurrencyInstance(loc);
		Date currentDate = new Date(System.currentTimeMillis());
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,
		loc);
		System.out.println(df.format(currentDate));
		ResourceBundle rb = ResourceBundle.getBundle("Resources/MessagesBundle", loc);
		Motorcyclist man = new Motorcyclist("Ivan", "1034d");
		Helmet h = new Helmet("helmet Bell", 50, 15);
		Gloves g = new Gloves("gloves Bell", 10, 1);
		Jacket j = new Jacket("jacket Bell", 60, 20);
		man.setHelmet(h);
		man.setGloves(g);
		man.setJacket(j);
		man.sortWeightAlone();
		System.out.println(valFormat.format(man.totalCost()) +" " +  rb.getString("totalCost"));
		man.showIfFit(5, 55);
		try {
			man.checkLicense();
		} catch (LicsenseException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(man.getLicense());
		List<Motorcyclist> mList = new ArrayList<>();
		mList.add(man);
		Motorcyclist man1 = new Motorcyclist("Peter", "1993a");
		Helmet h1 = new Helmet("helmet Ruby", 40, 17);
		Gloves g1 = new Gloves("gloves Ruby", 15, 2);
		Jacket j1 = new Jacket("jacket Ruby", 55, 23);
		man1.setHelmet(h1);
		man1.setGloves(g1);
		man1.setJacket(j1);
		Motorcyclist man2 = new Motorcyclist("Daniel", "46798ddda");
		Helmet h2 = new Helmet("helmet AGV", 33, 11);
		Gloves g2 = new Gloves("gloves AGV", 11, 1);
		Jacket j2 = new Jacket("jacket AGV", 52, 18);
		man2.setHelmet(h2);
		man2.setGloves(g2);
		man2.setJacket(j2);
		mList.add(man1);
		mList.add(man2);
		Equip.sortWeightList(mList);
		Motorcyclist.showIfFitArray(10, 40, mList);
		man1.helmet.wearMsg();
	}
}