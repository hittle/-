package builder;

/**
 * 项目描述：Burger.java
 * @author lzl
 *
 * @date 2021年3月15日下午9:03:56
 * @version: V1.0
 */
public class Burger implements Item{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
