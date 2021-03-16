package flyweight;

import java.util.HashMap;

/**
 * ��Ŀ������FlyweightPattern.java
 * @author lzl
 *
 * @date 2021��3��16������7:23:05
 * @version: V1.0
 */
public class FlyweightPattern {

	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight flyweight01 = factory.getFlyweight("a");
		Flyweight flyweight02 = factory.getFlyweight("a");
		Flyweight flyweight03 = factory.getFlyweight("a");
		Flyweight flyweight11 = factory.getFlyweight("b");
		Flyweight flyweight12 = factory.getFlyweight("b");
		flyweight01.operation(new UnsharedConcreteFlyweight("��һ�ε���a"));
		flyweight02.operation(new UnsharedConcreteFlyweight("�ڶ��ε���a"));
		flyweight03.operation(new UnsharedConcreteFlyweight("�����ε���a"));
		flyweight11.operation(new UnsharedConcreteFlyweight("��һ�ε���b"));
		flyweight12.operation(new UnsharedConcreteFlyweight("�ڶ��ε���b"));
		
		
	}
}

//����Ԫģʽ
class UnsharedConcreteFlyweight{
	private String info;
	
	/**
	 * 
	 */
	public UnsharedConcreteFlyweight(String info) {
		this.info = info;
	}

	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	
}

//������Ԫ��ɫ
interface Flyweight{
	public void operation(UnsharedConcreteFlyweight state);
}

//������Ԫ��ɫ
class ConcreteFlyweight implements Flyweight{
	
	private String key;
	/**
	 * 
	 */
	ConcreteFlyweight(String key) {
		this.key = key;
		System.out.println("������Ԫ"+ key + "������");
	}
	@Override
	public void operation(UnsharedConcreteFlyweight state) {
		System.out.println("������Ԫ"+ key + "������");
		System.out.println("����Ԫ��Ϣ��"+ state.getInfo());
	}
}

//��Ԫ������ɫ
class FlyweightFactory{
	private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();
	
	public Flyweight getFlyweight(String key) {
		Flyweight flyweight = (Flyweight)flyweights.get(key);
		if(flyweight != null)
			System.out.println("������Ԫ"+ key + "�Ѵ��ڣ����ɹ���ȡ");
		else {
			flyweight = new ConcreteFlyweight(key);
			flyweights.put(key, flyweight);
		}
		return flyweight;
	}
}
