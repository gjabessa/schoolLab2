import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	ArrayList<Person> person;
	Department(String name){
		this.name = name;
		person = new ArrayList<Person>();
	}
	
	double getTotalSalary(){
		double salary = 0;
		for(Person person: person) {
			salary += person.getSalary();
		}
		return salary;
	}
	
	void showAllMembers() {
		System.out.println(person);
	}
	
	void unitsPerFaculty() {
		List<Integer> units = new ArrayList<Integer>();
		for(Person person: person) {
			if(person.getTotalUnit() > 0) {
				units.add(person.getTotalUnit());
			}
			
		}
		System.out.println(units);
	}
	
	void addPerson(Person person_) {
		person.add(person_);
	}
	
	

	public void getStudentsTaughtBy(String name2) {
		List<Student> studentsTaughtBy = new ArrayList<Student>();
		for(Person faculty: person) {
			if(faculty.getName().equals(name2)) {
				Faculty faculty1 = (Faculty) faculty;
				List<Course> courses = faculty1.getCourses();
				for(Course course: courses) {
					for(Person person_: person) {
						if(person_.getClass().getName().equals("Student")) {
							Student student = (Student) person_;
							if(student.getCoursesTaken().contains(course) && !studentsTaughtBy.contains(student)) {
								studentsTaughtBy.add(student);
								
							}
						}
					}
				}
			}
		}
		System.out.println("Students taught by "+name2);
		System.out.println(studentsTaughtBy);
		
	}
	
	
	
	
}
