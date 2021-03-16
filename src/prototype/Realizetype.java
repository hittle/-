/**
 * 
 */
package prototype;

/**
 * 项目描述：Realizetype.java
 * @author lzl
 *
 * @date 2021年3月15日下午4:47:05
 * @version: V1.0
 */
public class Realizetype implements Cloneable{

	/**
	 * 无参构造器
	 */
	public Realizetype() {
		// TODO Auto-generated constructor stub
		System.out.println("具体原型创建成功");
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		System.out.println("具体原型复制成功");
		return (Realizetype)super.clone();
	}
	
}
