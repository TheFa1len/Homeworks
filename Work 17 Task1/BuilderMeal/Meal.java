package BuilderMeal;
/**
 * Class of describing complex meal 
 * @author DEN
 *
 */
public class Meal {
	private String first = "";
	private String second = "";
	private String third = "";

	public String getFirst() {
		return first;
	}
	public void setFirst(String s){
		first = s;
	}

	public String getSecond() {
		return second;
	}
	public void setSecond(String s){
		second = s;
	}

	public String getThird() {
		return third;
	}
	public void setThird(String s){
		third = s;
	}
	public String toString(){
		return ("Complex have:" + "\n" + first + "\n" + second + "\n" + third);
	}
}
