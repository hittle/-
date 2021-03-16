package proxy;

/**
 * ��Ŀ������ProxyTest.java
 * @author lzl
 *
 * @date 2021��3��16������1:34:25
 * @version: V1.0
 */
public class ProxyTest {

	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.request();
	}
}

interface Subject{
	void request();
}

class RealSubject implements Subject{
	public void request() {
		System.out.println("������ʵ���ⷽ��");
	}
}

class Proxy implements Subject{
	private RealSubject realSubject;
	@Override
	public void request() {
		if(realSubject == null) {
			realSubject = new RealSubject();
		}
		preRequest();
		realSubject.request();
		postRequest();
	}
	
	public void preRequest() {
		System.out.println("������ʵ����ǰ����");
	}
	
	public void postRequest() {
		System.out.println("������ʵ�������");
	}
}