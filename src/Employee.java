
public class Employee {
	private int id;
	private String name;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
    public String getName() {
    	return name;
    }
    public void setName(String name) {
		this.name=name;
	}
    public int getSalary() {
    	return salary;
    }
    public void setSalary(int salary) {
    	this.salary=salary;
    }
    public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(123);
		e.setName("subbu");
		e.setSalary(292820);
		System.out.println("employee id:"+e.getId());
		System.out.println("employee Name:"+e.getName());
		System.out.println("employee Salary:"+e.getSalary());
	}
}


