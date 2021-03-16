package bridge;

/**
 * 项目描述：Circle.java
 * @author lzl
 *
 * @date 2021年3月16日上午11:04:23
 * @version: V1.0
 */
public class Circle extends Shape{

	private int x,y,radius;
	/**
	 * @param drawApi
	 */
	protected Circle(int x,int y,int radius,DrawApi drawApi) {
		super(drawApi);
		this.x = x;
		this.y = y;
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawApi.drawCircle(radius, x, y);
	}

}
