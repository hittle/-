package filter;

import java.util.List;

/**
 * 项目描述：Criteria.java
 * @author lzl
 *
 * @date 2021年3月16日上午11:21:05
 * @version: V1.0
 */
public interface Criteria {

	public List<Person> meetCriteria(List<Person> persons);
}
