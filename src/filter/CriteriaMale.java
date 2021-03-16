package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * ��Ŀ������CriteriaMale.java
 * @author lzl
 *
 * @date 2021��3��16������11:22:40
 * @version: V1.0
 */
public class CriteriaMale implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> malePersons = new ArrayList<Person>();
		
		for(Person person : persons) {
			if(person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
