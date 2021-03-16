/**
 * 
 */
package singleton;

/**
 * 项目描述：HungryTest.java
 * @author lzl
 *
 * @date 2021年3月15日下午4:43:56
 * @version: V1.0
 */
public class HungryTest {

	/**
	 * 
	 * @method main
	 * @user lzl
	 * @date 2021年3月15日下午4:44:11
	 * @param args
	 */
	public static void main(String[] args) {
		
		HungrySingleton instance = HungrySingleton.getInstance();
		HungrySingleton instance2 = HungrySingleton.getInstance();
		if(instance == instance2) {
			System.out.println("是同一个对象");
		}
	}
}
