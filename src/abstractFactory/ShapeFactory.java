/**
 * 
 */
package abstractFactory;

/**
 * 项目描述：ShapeFactory.java
 * @author lzl
 *
 * @date 2021年3月15日下午8:26:06
 * @version: V1.0
 */
public class ShapeFactory extends AbstractFactory{

	/* (non-Javadoc)
	 * @see abstractFactory.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see abstractFactory.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if(shape == null)
		return null;
		else if(shape.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else if(shape.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		else if(shape.equalsIgnoreCase("SQUARE"))
			return new Square();
		return null;
	}

}
