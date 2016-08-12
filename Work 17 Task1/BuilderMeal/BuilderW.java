package BuilderMeal;
/**
 * Abstract builder for meal with added
 * @author DEN
 *
 */
public abstract class BuilderW {
	protected MealWith mealWith = new MealWith();

	public MealWith getMealW() {
		return mealWith;
	}

	public abstract void buildFirst();

	public abstract void buildSecond();

	public abstract void buildThird();

	public abstract void buildDop(String s);
}