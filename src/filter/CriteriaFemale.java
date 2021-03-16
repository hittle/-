package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * ��Ŀ������CriteriaFemale.java
 * @author lzl
 *
 * @date 2021��3��16������11:24:33
 * @version: V1.0
 */
public class CriteriaFemale implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> femalePersons = new ArrayList<Person>();
		
		for(Person person : persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}
