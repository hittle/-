package template;

import org.xml.sax.ext.Attributes2;

/**
 * ��Ŀ������TemplateMethodPattern.java
 * ģ�巽��ģʽ
 * @author lzl
 *
 * @date 2021��3��16������8:47:12
 * @version: V1.0
 */
public class TemplateMethodPattern {

	public static void main(String[] args) {
		AbstractClazz tm = new ConcreteClass();
		tm.TemplateMethod();
	}
}

//������
abstract class AbstractClazz{
	//ģ�巽��
	public void TemplateMethod() {
		 specificMethod();
		 abstractMethod1();
		 abstractMethod2();
	}
	//���巽��
	public void specificMethod() {
		System.out.println("�������еľ��巽�������á�����");
	}
	//���󷽷�1
	public abstract void abstractMethod1();
	//���󷽷�2
	public abstract void abstractMethod2();
}

//��������
class ConcreteClass extends AbstractClazz{

	@Override
	public void abstractMethod1() {
		// TODO Auto-generated method stub
		System.out.println("���󷽷�1�����á�����");
	}

	@Override
	public void abstractMethod2() {
		// TODO Auto-generated method stub
		System.out.println("���󷽷�2������.����");
	}
	
}