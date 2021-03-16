package builder;

/**
 * ��Ŀ������BuilderPatternDemo.java
 * @author lzl
 *
 * @date 2021��3��15������9:16:30
 * @version: V1.0
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost:" +vegMeal.getCost() );
		
		Meal nonVegMeal = mealBuilder.prepareNoVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost:" +nonVegMeal.getCost() );
	}
}
