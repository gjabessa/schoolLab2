import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
 private double GPA;
 List<Course> courses;
	 Student(String name, String phone, int age, double GPA){
		 super.setName(name);
			super.setPhone(phone);
			super.setAge(age);
			this.GPA = GPA;
			courses = new ArrayList<Course>();
	 }
	 void getTotalUnits() {
		 
	 }
 
	void addCourse(Course course) {
		courses.add(course);
	}
 
	List<Course> getCoursesTaken(){
		return courses;
	}

}
