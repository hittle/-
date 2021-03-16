package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目描述：AndCriteria.java
 * @author lzl
 *
 * @date 2021年3月16日上午11:26:53
 * @version: V1.0
 */
public class AndCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;
	/**
	 * 
	 */
	public AndCriteria(Criteria criteria,Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
