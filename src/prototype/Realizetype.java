/**
 * 
 */
package prototype;

/**
 * ��Ŀ������Realizetype.java
 * @author lzl
 *
 * @date 2021��3��15������4:47:05
 * @version: V1.0
 */
public class Realizetype implements Cloneable{

	/**
	 * �޲ι�����
	 */
	public Realizetype() {
		// TODO Auto-generated constructor stub
		System.out.println("����ԭ�ʹ����ɹ�");
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		System.out.println("����ԭ�͸��Ƴɹ�");
		return (Realizetype)super.clone();
	}
	
}
