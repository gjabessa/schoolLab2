
public class Person {
	private String Name;
	private String Phone;
	private int Age;
	
	void setName(String name){
		this.Name = name;
	}
	
	String getName() {
		return this.Name;
	}
	void setPhone(String phone){
		this.Phone = phone;
	}
	void setAge(int age){
		this.Age = age;
	}
	
	double getSalary() {
		return 0;
	}
	
	public String toString(){
		return "{Name: "+Name+" Phone: "+Phone+" Age "+ Age+ "}";
	}
	
   void addCourse(Course course) {
		
	}
   
   int getTotalUnit() {
	   return 0;
   }
   
  
}
