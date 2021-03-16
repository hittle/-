package decorator;

/**
 * 项目描述：DecoratorPattern.java
 * @author lzl
 *
 * @date 2021年3月16日下午3:47:09
 * @version: V1.0
 */
public class DecoratorPattern {
	public static void main(String[] args) {
		Component p = new ConcreateComponent();
		p.operation();
		
		System.out.println("————————————");
		
		Component d = new ConcreteDecorator(p);
		d.operation();
	}
	
}
//抽象构件角色
interface Component{
	public void operation();
	
}

//具体构件角色
class ConcreateComponent implements Component{

	/**
	 * 
	 */
	public ConcreateComponent() {
		System.out.println("创建具体构件角色");
	}
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("调用具体构建角色的方法operation（）");
	}
	
}

//抽象装饰角色
class Decorator implements Component{
	private Component component;
	/**
	 * 
	 */
	public Decorator(Component component) {
		this.component = component;
	}
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		component.operation();
	}
}

//具体装饰角色
class ConcreteDecorator extends Decorator{
	/**
	 * 
	 */
	public ConcreteDecorator(Component component) {
		super(component);
	}
	public void operation() {
		super.operation();
		addOperation();
	}
	public void addOperation() {
		System.out.println("为具体构件角色添加额外的功能addOperation（）");
	}
}
