/**
 * 
 */
package abstractFactory;

/**
 * ��Ŀ������AbstractFactory.java
 * @author lzl
 * @date 2021��3��15������8:24:48
 * @version: V1.0
 */
public abstract class AbstractFactory {

	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
