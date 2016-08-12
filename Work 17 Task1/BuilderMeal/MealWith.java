package BuilderMeal;
/**
 * Class of describing complex meal with additionals
 * @author DEN
 *
 */
public class MealWith {
	private String first;
	private String second;
	private String third;
	private String dop;

	public String getFirst() {
		return first;
	}

	public void setFirst(String s) {
		first = s;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String s) {
		second = s;
	}

	public String getThird() {
		return third;
	}

	public void setThird(String s) {
		third = s;
	}
	public String getDop (){
		return dop;
	}
	public void setDop(String s){
		dop = s;
	}
	public String toString() {
		return ("Complex have:" + "\n" + first + "\n" + second + "\n" + third + "\n" + dop + " is added");
	}
}
