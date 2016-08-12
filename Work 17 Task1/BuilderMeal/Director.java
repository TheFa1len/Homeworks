package BuilderMeal;
/**
 * Director for building meal with having two different types of builders mechanism
 * @author DEN
 *
 */
public class Director {
	public static Meal createMeal (Builder builder){
		builder.buildFirst();
		builder.buildSecond();
		builder.buildThird();
		return builder.getMeal();
	}
	public static MealWith createMealW (BuilderW builderW, String s){
		builderW.buildFirst();
		builderW.buildSecond();
		builderW.buildThird();
		builderW.buildDop(s);
		return builderW.getMealW();
	}

}
