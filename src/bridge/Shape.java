package bridge;

/**
 * ��Ŀ������Shape.java
 * @author lzl
 *
 * @date 2021��3��16������11:02:55
 * @version: V1.0
 */
public abstract class Shape {

	protected DrawApi drawApi;
	protected Shape(DrawApi drawApi) {
		this.drawApi = drawApi;
	}
	public abstract void draw();
}
