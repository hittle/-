package filter;

/**
 * 项目描述：Person.java
 * @author lzl
 *
 * @date 2021年3月16日上午11:19:18
 * @version: V1.0
 */
public class Person {

	private String name;
	private String gender;
	private String maritalStatus;
	
	public Person(String name, String gender, String maritalStatus) {
		super();
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @return the maritalStatus
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}
	
	
}
