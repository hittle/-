package builder;

/**
 * 项目描述：MealBuilder.java
 * @author lzl
 *
 * @date 2021年3月15日下午9:13:33
 * @version: V1.0
 */
public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	public Meal prepareNoVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
