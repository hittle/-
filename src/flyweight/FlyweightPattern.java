package flyweight;

import java.util.HashMap;

/**
 * 项目描述：FlyweightPattern.java
 * @author lzl
 *
 * @date 2021年3月16日下午7:23:05
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
		flyweight01.operation(new UnsharedConcreteFlyweight("第一次调用a"));
		flyweight02.operation(new UnsharedConcreteFlyweight("第二次调用a"));
		flyweight03.operation(new UnsharedConcreteFlyweight("第三次调用a"));
		flyweight11.operation(new UnsharedConcreteFlyweight("第一次调用b"));
		flyweight12.operation(new UnsharedConcreteFlyweight("第二次调用b"));
		
		
	}
}

//非享元模式
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

//抽象享元角色
interface Flyweight{
	public void operation(UnsharedConcreteFlyweight state);
}

//具体享元角色
class ConcreteFlyweight implements Flyweight{
	
	private String key;
	/**
	 * 
	 */
	ConcreteFlyweight(String key) {
		this.key = key;
		System.out.println("具体享元"+ key + "被创建");
	}
	@Override
	public void operation(UnsharedConcreteFlyweight state) {
		System.out.println("具体享元"+ key + "被调用");
		System.out.println("非享元信息是"+ state.getInfo());
	}
}

//享元工厂角色
class FlyweightFactory{
	private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();
	
	public Flyweight getFlyweight(String key) {
		Flyweight flyweight = (Flyweight)flyweights.get(key);
		if(flyweight != null)
			System.out.println("具体享元"+ key + "已存在，被成功获取");
		else {
			flyweight = new ConcreteFlyweight(key);
			flyweights.put(key, flyweight);
		}
		return flyweight;
	}
}
