package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * ��Ŀ������CriteriaSingle.java
 * @author lzl
 *
 * @date 2021��3��16������11:25:49
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
