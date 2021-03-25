import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person{
	private double Salary;
	List<Course> courses;
	
	
	Faculty(String name, String phone, int age, double salary){
		super.setName(name);
		super.setPhone(phone);
		super.setAge(age);
		this.Salary = salary;
		courses = new ArrayList<Course>();
	}
	List<Course> getCourses() {
		return courses;
	}
	
	void addCourse(Course course) {
		courses.add(course);
	}
	double getSalary(){
		return Salary;
	}
	
	int getTotalUnit() {
		int totalUnit = 0;
		for(Course course:courses) {
			totalUnit += course.getUnits();
		}
		return totalUnit;
	}
}
