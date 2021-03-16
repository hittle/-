/**
 * 
 */
package abstractFactory;

/**
 * ��Ŀ������AbstractFactoryPatternDemo.java
 * @author lzl
 *
 * @date 2021��3��15������8:35:15
 * @version: V1.0
 */
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		//��ȡ��״����
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		//��ȡ��״ΪCIRCLR�Ķ���
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		
		//����circle��draw����
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		
		shape3.draw();
		//��ȡ��ɫ����
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		//��ȡ��ɫ����
		Color color1 = colorFactory.getColor("RED");
		//������ɫ����
		color1.fill();
		
		Color color2 = colorFactory.getColor("GREEN");
		
		color2.fill();
		
		Color color3 = colorFactory.getColor("BLUE");
		
		color3 .fill();
	}
}
