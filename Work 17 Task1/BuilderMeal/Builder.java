package BuilderMeal;
/**
 * Builder for meal without added
 * @author DEN
 *
 */
public abstract class Builder {
	protected Meal meal = new Meal();

	public Meal getMeal() {
		return meal;
	}

	public abstract void buildFirst();

	public abstract void buildSecond();

	public abstract void buildThird();
}
