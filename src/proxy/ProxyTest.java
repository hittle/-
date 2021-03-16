package proxy;

/**
 * 项目描述：ProxyTest.java
 * @author lzl
 *
 * @date 2021年3月16日下午1:34:25
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
		System.out.println("访问真实主题方法");
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
		System.out.println("访问真实主题前处理");
	}
	
	public void postRequest() {
		System.out.println("访问真实主题后处理");
	}
}