/**
 * 
 */
package prototype;

/**
 * 项目描述：PrototypeTest.java
 * @author lzl
 *
 * @date 2021年3月15日下午4:49:57
 * @version: V1.0
 */
public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Realizetype obj = new Realizetype();
		
		Realizetype obj2 = (Realizetype) obj.clone();
		
			System.out.println("obj == obj2 ?" + (obj == obj2));
	}
}
