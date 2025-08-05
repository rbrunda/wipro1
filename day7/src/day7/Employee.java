package day7;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Employee1{
	
		int empNo;
		String name;
		int salary;
		Employee1(int empNo, String name, int salary){
			this.empNo=empNo;
			this.name=name;
			this.salary=salary;
		}
	}
public class Employee{
	public static void main(String [] agrs) {
		List<Employee1> s1 =new ArrayList<Employee1>();
		s1.add(new Employee1(100,"jhon",18000));
		s1.add(new Employee1(200,"varun",10000));
		s1.add(new Employee1(300,"riya",22000));
		List<Employee1> s2=s1.stream()
				.filter(emp -> emp.salary >15000)
				.collect(Collectors.toList());
		for (Employee1 employee:s2) {
			System.out.println(employee.name);
		}
	}
}