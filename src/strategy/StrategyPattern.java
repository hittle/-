package strategy;

/**
 * ��Ŀ������StrategyPattern.java
 * @author lzl
 * ����ģʽ
 * @date 2021��3��16������9:11:34
 * @version: V1.0
 */
public class StrategyPattern {

	public static void main(String[] args) {
		Context c = new Context();
		Strategy s = new ConcreteStrategyA();
		c.setStrategy(s);
		c.strategyMethod();
		System.out.println("-----------------");
		s = new ConcreteStrategyB();
		c.setStrategy(s);
		c.strategyMethod();
	}
}
 
//���������
interface Strategy{
	public void strategyMethod();//���Է���
}

//���������A
class ConcreteStrategyA implements Strategy{

	@Override
	public void strategyMethod() {

		System.out.println("�������A�Ĳ��Է��������ʣ�");
	}
	
}
//���������B
class ConcreteStrategyB implements Strategy{

	@Override
	public void strategyMethod() {

		System.out.println("�������B�Ĳ��Է��������ʣ�");
	}
	
}

//������
class Context{
	private Strategy strategy;
	public Strategy getStrategy() {
		return strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void strategyMethod() {
		strategy.strategyMethod();
	}
}