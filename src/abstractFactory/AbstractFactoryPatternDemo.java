/**
 * 
 */
package abstractFactory;

/**
 * 项目描述：AbstractFactoryPatternDemo.java
 * @author lzl
 *
 * @date 2021年3月15日下午8:35:15
 * @version: V1.0
 */
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		//获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		//获取形状为CIRCLR的对象
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		
		//调用circle的draw方法
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		
		shape3.draw();
		//获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		//获取颜色对象
		Color color1 = colorFactory.getColor("RED");
		//调用颜色方法
		color1.fill();
		
		Color color2 = colorFactory.getColor("GREEN");
		
		color2.fill();
		
		Color color3 = colorFactory.getColor("BLUE");
		
		color3 .fill();
	}
}
