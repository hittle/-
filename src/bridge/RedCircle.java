package bridge;

/**
 * ��Ŀ������RedCircle.java
 * @author lzl
 *
 * @date 2021��3��16������11:00:04
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
