package template;

import org.xml.sax.ext.Attributes2;

/**
 * 项目描述：TemplateMethodPattern.java
 * 模板方法模式
 * @author lzl
 *
 * @date 2021年3月16日下午8:47:12
 * @version: V1.0
 */
public class TemplateMethodPattern {

	public static void main(String[] args) {
		AbstractClazz tm = new ConcreteClass();
		tm.TemplateMethod();
	}
}

//抽象类
abstract class AbstractClazz{
	//模板方法
	public void TemplateMethod() {
		 specificMethod();
		 abstractMethod1();
		 abstractMethod2();
	}
	//具体方法
	public void specificMethod() {
		System.out.println("抽象类中的具体方法被调用。。。");
	}
	//抽象方法1
	public abstract void abstractMethod1();
	//抽象方法2
	public abstract void abstractMethod2();
}

//具体子类
class ConcreteClass extends AbstractClazz{

	@Override
	public void abstractMethod1() {
		// TODO Auto-generated method stub
		System.out.println("抽象方法1被调用。。。");
	}

	@Override
	public void abstractMethod2() {
		// TODO Auto-generated method stub
		System.out.println("抽象方法2被调用.。。");
	}
	
}