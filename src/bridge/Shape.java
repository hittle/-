package bridge;

/**
 * 项目描述：Shape.java
 * @author lzl
 *
 * @date 2021年3月16日上午11:02:55
 * @version: V1.0
 */
public abstract class Shape {

	protected DrawApi drawApi;
	protected Shape(DrawApi drawApi) {
		this.drawApi = drawApi;
	}
	public abstract void draw();
}
