package abstractions;

import java.util.Collection;
import entities.Employee;

public interface EmployeeRepository extends Iterable<Employee> {

	Employee getById(int id);

	Collection<Employee> getByExperience(Integer experience);

	Collection<NamePhoneTuple> getPhonesByName(String namePattern);

	Collection<Employee> getByPhone(String phone);

	Employee add(Employee e);

	Employee add(String fullName, String phone, Integer experience);

	public static record NamePhoneTuple(String fullName, String phone) {
	}
}
