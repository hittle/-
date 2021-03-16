package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目描述：CriteriaSingle.java
 * @author lzl
 *
 * @date 2021年3月16日上午11:25:49
 * @version: V1.0
 */
class CriteriaSingle implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> singlePersons = new ArrayList<Person>();
		
		for(Person person : persons) {
			if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
