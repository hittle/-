/**
 * 
 */
package singleton;

/**
 * ��Ŀ������LazyTest.java
 * @author lzl
 *
 * @date 2021��3��15������4:39:47
 * @version: V1.0
 */
public class LazyTest {

	/**
	 * 
	 * @method main
	 * @user lzl
	 * @date 2021��3��15������4:41:14
	 * @param args
	 */
	public static void main(String[] args) {
		LazySingleton instance = LazySingleton.getInstance();
		LazySingleton instance2 =  LazySingleton.getInstance();
		if(instance == instance2) {
			System.out.println("��ͬһ������");
		}
	}
}
