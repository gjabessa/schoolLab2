
public class Staff extends Person {
	private double Salary;

	
	Staff(String name, String phone, int age, double salary){
		super.setName(name);
		super.setPhone(phone);
		super.setAge(age);
		this.Salary = salary;
	}
	
	double getSalary(){
		return Salary;
	}
	
	
	
}
