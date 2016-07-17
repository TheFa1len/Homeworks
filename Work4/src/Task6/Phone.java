package Task6;

public class Phone {
	/*
	 * Phone: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
Дебет, Кредит, Время городских и междугородных разговоров.
Создать массив объектов. Вывести:
a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
b) сведения об абонентах, которые пользовались междугородной связью;
c) сведения об абонентах в алфавитном порядке.
	 */
	String name;
	String surname;
	String secondName;
	String adress;
	int creditNumber = 0;
	private int id = 0;
	int debet = 0;
	int credit = 0;
	int timeIn = 0;
	int timeOut = 0;
	//p(=17)*x1+q(=37)*y1=h
	public Phone (int id, String name, String surname, String secondName, String adress, int creditNumber){
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.secondName = secondName;
		this.adress = adress;
		this.creditNumber = creditNumber;	
	}
	public Phone (int id, String name, String surname, String secondName, String adress, int creditNumber, int debet, int credit, int timeIn, int timeOut){
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.secondName = secondName;
		this.adress = adress;
		this.creditNumber = creditNumber;
		this.debet = debet;
		this.credit = credit;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
	}
	@Override
	public int hashCode(){
		int result=17*id+37*creditNumber;
			return result;	
	}
	
	@Override
	public boolean equals(Object obj){
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Phone other = (Phone) obj;
			if (id!=other.id)
				return false;
			if (creditNumber!=other.creditNumber)
				return false;
			if (!name.equals(other.name))
				return false;
			if (!surname.equals(other.surname))
				return false;
			if (!secondName.equals(other.secondName))
				return false;
			if (!adress.equals(other.adress))
				return false;
			return true;
	}
	int GetID (){
		return id;
	}
	void SetID ( int a){
		id=a;
	}
	@Override
	public String toString(){
		String s1=Integer.toString(id) + " " + name + " " + surname + " " + adress;
		return s1;
	}
	public static void showBiggerOut(Phone p1, int time){
		if (p1.timeIn>time){
			System.out.println("Subscriber " + p1.toString() + " have overtime for inner callings");
		}
	}
	
}
