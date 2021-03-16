package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目描述：Meal.java
 * @author lzl
 *
 * @date 2021年3月15日下午9:09:14
 * @version: V1.0
 */
public class Meal {

	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		for(Item item : items) {
			cost+= item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for(Item item : items) {
			System.out.print("Item :" + item.name());
			System.out.print(",Packing :" + item.packing().pack());
			System.out.println(",Price :" + item.price());
		}
	}
}
