package ProjectTwo;

public class Doctor extends Employee {
	private String specialization;

	public Doctor(int SSn,int age, String name, String prof, String nb, String specialization) {
		super(SSn, age, name, prof, nb);
		this.specialization= specialization;
		
	}
	public String speciality(){
		
		return "I am specializated at "+ specialization;
	}
	
	public String toString() {
		return super.toString() + "\n"+"I am specializated at "+ specialization;
		
	}
	
	

}