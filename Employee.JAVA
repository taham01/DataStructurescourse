package ProjectTwo;

public class Employee {
	private int SSn;
	private int age;
	private String Name;
	
	private String Profession;
	private String PhoneNumber;
	
	public Employee(int SSn,int age, String name,  String prof, String nb) {
		this.SSn=SSn;
		this.age=age;
		this.Name=name;
		
		this.Profession = prof;
		this.PhoneNumber= nb;
	}
	public int getSSn() {
		return SSn;
	}
	
	public void setSSn(int n) {
		this.SSn=n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	public String getProfession() {
		return Profession;
	}
	public void setProfession(String profession) {
		Profession = profession;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	public String toString (){
	return "Name : " + Name +"\n"+ "Age : "+ age+ "\n"+ "Number : " +PhoneNumber ;}
		
	}
