
public class Course {
	private String Number;
	private String Title;
	private int Units;
	

	Course(String number, String title, int units){
		this.Number = number;
		this.Title = title;
		this.Units = units;
	}
	
	public int getUnits() {
		return Units;
	}
}
