public class Employee {
	private String name;
	private String role;
	private int empId;
	private int age;
	private double hourlyPay;

	public Employee(){
		this.name = "tom";
		this.role = "help";
		this.empId = 3210;
		this.age = 32;
		this.hourlyPay = 32;}
	public Employee (String name, String role, int empId, int age, double hourlPay){
		this.name = name;
		this.role = role;
		this.empId = empId;
		this.age = age;
		this.hourlyPay = hourlPay;}

 public void setName(String name) {
	 this.name = name;
 }
 public void setRole(String role) {
	 this.role = role;
 }
 public void setEmpId(int empId) {
	 this.empId = empId;
 }
 public void setAge(int age) {
	 this.age = age;
 }
 public void setHourlyPay(double hourlyPay) {
	 this.hourlyPay = hourlyPay;
 }
 public String getName(String name) {
	 return this.name;
 }
 public String getRole(String role) {
	 return this.role;
 }
 public int getEmpId(int empId) {
	 return this.empId;
 }
 public int getAge(int age) {
	 return this.age;
 }
 public double getHourlyPay(double hourlyPay) {
	 return this.hourlyPay;
 }
 public boolean equals(Object O) {
	 if(this == O)
		 return true;
	 if(O instanceof Employee) {
		 Employee OEmployee = (Employee)O;
		 if(this.name == OEmployee.name) {
			 if(this.role == OEmployee.role) {
				 if(this.empId == OEmployee.empId) {
					 if(this.age == OEmployee.age) {
						 if(this.hourlyPay == OEmployee.hourlyPay)
							 return true;
					 }
				 }
			 }
		 }
	 }
 
 return false;
	}
@Override
	public String toString() {
		return "Employee" + "name" + this.name + "role" + this.role + "empId" + this.empId + "age" + this.age + "hourlyPay" + this.hourlyPay;
	}}