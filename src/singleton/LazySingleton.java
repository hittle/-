package singleton;


/**
 * @author lzl
 * ����
 * ����ģʽ
 *
 */
public class LazySingleton {

	//��֤lazySingleton�������߳���ͬ��
	public static  volatile LazySingleton lazySingleton = null;

	private LazySingleton() {
	}//���ⱻ�ⲿʵ����
	
	public static synchronized LazySingleton getInstance() {
		//
		if(lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	
	}
	
	
}
