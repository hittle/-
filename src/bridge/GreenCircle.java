package bridge;

/**
 * 项目描述：GreenCircle.java
 * @author lzl
 *
 * @date 2021年3月16日上午11:02:14
 * @version: V1.0
 */
public class GreenCircle implements DrawApi{

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle[ color: green, radius: "+ radius 
				+",x: "+ x + ",y: " + y +"]");
	}

}
