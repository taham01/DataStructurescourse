package ProjectTwo;

public class MainDriver {
	
	public static void main(String[] args) {
		Doctor dr = new Doctor(265489,35,"Joe Doe","Doctor","70777555","Cardiology");
		Receptionist re = new Receptionist(265489,25,"Karen Doe","Receptionist","70999444",5);
		
		System.out.println(dr.getAge());
		
		System.out.println(dr.getSSn());
		dr.setPhoneNumber("03958964");
		System.out.println(dr.getPhoneNumber());
		
		System.out.println(re.getName());
		System.out.println(re.location());
		
		System.out.println(dr.toString());
		System.out.println(re.toString());
		

		
		
	}

}