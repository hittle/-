package singleton;


/**
 * @author lzl
 * ����
 * ����ģʽ
 *
 */
public class HungrySingleton {

	public static final HungrySingleton instance = new HungrySingleton();
	
	private HungrySingleton() {
	}
	
	public static HungrySingleton getInstance() {
		return instance;
	}
}
