package facade;

/**
 * ��Ŀ������FacadePattern.java
 * @author lzl
 *
 * @date 2021��3��16������7:09:55
 * @version: V1.0
 */
public class FacadePattern {
	public static void main(String[] args) {
		Facade f = new Facade();
		f.method();
	}
	
}

//��۽�ɫ
class Facade{
	private SubSystem01 obj1 = new SubSystem01(); 
	private SubSystem02 obj2 = new SubSystem02(); 
	private SubSystem03 obj3 = new SubSystem03(); 
	
	public void method(){
		obj1.method();
		obj2.method();
		obj3.method();
	}
}

//��ϵͳ��ɫ
class SubSystem01{
	public void method() {
		System.out.println("��ϵͳ01��method����������");
	}
}
//��ϵͳ��ɫ
class SubSystem02{
	public void method() {
		System.out.println("��ϵͳ02��method����������");
	}
}
//��ϵͳ��ɫ
class SubSystem03{
	public void method() {
		System.out.println("��ϵͳ02��method����������");
	}
}