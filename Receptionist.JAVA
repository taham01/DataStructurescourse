package ProjectTwo;

public class Receptionist extends Employee{
	private int floor;
	public Receptionist(int SSn,int age, String name, String prof, String nb, int floor) {
		super(SSn,age,name,prof,nb);
		this.floor=floor;
	}
	
	public String location() {
		
		return "I Work at floor number "+floor;
	}
	
	public String toString() {
		return super.toString()+"\n"+ "and i work at floor number "+floor;
		
	}

}