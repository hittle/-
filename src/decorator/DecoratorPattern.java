package decorator;

/**
 * ��Ŀ������DecoratorPattern.java
 * @author lzl
 *
 * @date 2021��3��16������3:47:09
 * @version: V1.0
 */
public class DecoratorPattern {
	public static void main(String[] args) {
		Component p = new ConcreateComponent();
		p.operation();
		
		System.out.println("������������������������");
		
		Component d = new ConcreteDecorator(p);
		d.operation();
	}
	
}
//���󹹼���ɫ
interface Component{
	public void operation();
	
}

//���幹����ɫ
class ConcreateComponent implements Component{

	/**
	 * 
	 */
	public ConcreateComponent() {
		System.out.println("�������幹����ɫ");
	}
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("���þ��幹����ɫ�ķ���operation����");
	}
	
}

//����װ�ν�ɫ
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

//����װ�ν�ɫ
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
		System.out.println("Ϊ���幹����ɫ��Ӷ���Ĺ���addOperation����");
	}
}
