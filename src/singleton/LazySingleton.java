package singleton;


/**
 * @author lzl
 * 单例
 * 懒汉模式
 *
 */
public class LazySingleton {

	//保证lazySingleton在所有线程中同步
	public static  volatile LazySingleton lazySingleton = null;

	private LazySingleton() {
	}//避免被外部实例化
	
	public static synchronized LazySingleton getInstance() {
		//
		if(lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	
	}
	
	
}
