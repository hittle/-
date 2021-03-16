/**
 * 
 */
package abstractFactory;

/**
 * 项目描述：ColorFactory.java
 * @author lzl
 *
 * @date 2021年3月15日下午8:30:05
 * @version: V1.0
 */
public class ColorFactory extends AbstractFactory{

	/* (non-Javadoc)
	 * @see abstractFactory.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		if(color == null)
			return null;
		else if(color.equalsIgnoreCase("RED"))
			return new Red();
		else if (color.equalsIgnoreCase("GREEN")) 
			return new Green();
		else if(color.equalsIgnoreCase("BLUE"))
			return new Blue();
		return null;
	}

	/* (non-Javadoc)
	 * @see abstractFactory.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
