package bridge;

/**
 * 项目描述：RedCircle.java
 * @author lzl
 *
 * @date 2021年3月16日上午11:00:04
 * @version: V1.0
 */
public class RedCircle implements DrawApi{

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle[ color: red, radius: "+ radius 
				+",x: "+ x + ",y: " + y +"]");
	}

}
