/**
 * 
 */
package abstractFactory;

/**
 * 项目描述：AbstractFactory.java
 * @author lzl
 * @date 2021年3月15日下午8:24:48
 * @version: V1.0
 */
public abstract class AbstractFactory {

	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
