package builder;

/**
 * ��Ŀ������ColdDrink.java
 * @author lzl
 *
 * @date 2021��3��15������9:04:51
 * @version: V1.0
 */
public class ColdDrink implements Item{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
