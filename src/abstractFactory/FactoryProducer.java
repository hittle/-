/**
 * 
 */
package abstractFactory;

/**
 * ��Ŀ������FactoryProducer.java
 * @author lzl
 *
 * @date 2021��3��15������8:32:49
 * @version: V1.0
 */
public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("COLOR"))
			return new ColorFactory();
		else if(choice.equalsIgnoreCase("SHAPE"))
			return new ShapeFactory();
		else 
			return null;
	}
}
