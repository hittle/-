package builder;

/**
 * ��Ŀ������Burger.java
 * @author lzl
 *
 * @date 2021��3��15������9:03:56
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
