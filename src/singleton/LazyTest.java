/**
 * 
 */
package singleton;

/**
 * 项目描述：LazyTest.java
 * @author lzl
 *
 * @date 2021年3月15日下午4:39:47
 * @version: V1.0
 */
public class LazyTest {

	/**
	 * 
	 * @method main
	 * @user lzl
	 * @date 2021年3月15日下午4:41:14
	 * @param args
	 */
	public static void main(String[] args) {
		LazySingleton instance = LazySingleton.getInstance();
		LazySingleton instance2 =  LazySingleton.getInstance();
		if(instance == instance2) {
			System.out.println("是同一个对象");
		}
	}
}
