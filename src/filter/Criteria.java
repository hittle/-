package filter;

import java.util.List;

/**
 * ��Ŀ������Criteria.java
 * @author lzl
 *
 * @date 2021��3��16������11:21:05
 * @version: V1.0
 */
public interface Criteria {

	public List<Person> meetCriteria(List<Person> persons);
}
