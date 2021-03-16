package singleton;


/**
 * @author lzl
 * µ¥Àý
 * ¶öººÄ£Ê½
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
