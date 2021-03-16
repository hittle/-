/**
 * 
 */
package staticfactory;

/**
 * 项目描述：Client.java
 * @author lzl
 *
 * @date 2021年3月15日下午7:27:20
 * @version: V1.0
 */
public class Client {

	public static void main(String[] args) {
		Product product1 = SimpleFactory.makeProduct(0);
		Product product2 = SimpleFactory.makeProduct(1);
		product1.show();
		product2.show();
	}
	//抽象产品
	public interface Product{
		void show();
	}
	
	//具体产品1
	static class ConcreteProduct1 implements Product{

		/* (non-Javadoc)
		 * @see staticfactory.Client.Product#show()
		 */
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("具体产品1展示");
		}
		
	}
	
	static class ConcreteProduct2 implements Product{
		/* (non-Javadoc)
		 * @see staticfactory.Client.Product#show()
		 */
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("具体产品2展示");
		}
	}
	
	final class Const{
		static final int PRODUCT_A = 0;
		static final int PRODUCT_B = 1;
		static final int PRODUCT_C = 2;
	}
	
	static class SimpleFactory{
		public static Product makeProduct(int kind) {
			switch(kind) {
			case Const.PRODUCT_A:
				return new ConcreteProduct1();
			case Const.PRODUCT_B:
				return new ConcreteProduct2();
			default:
				return null;
			}
		}
	}
}
