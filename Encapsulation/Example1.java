/* aA class which contain private data memebers and piblic getter
and setter methods such class is known as java bean class */
class Emp
{
	private int empId;  // 0 => 1001
	private String empName; // null => Tejaswini
	
	public void setEmpId(int empId){
		this.empId=empId;
	}
	
	public void setEmpName(String empName){
		this.empName=empName;
	}
	public int getEmpId(){
		return empId;
	}
	
	public String getEmpName(){
		return empName;
	}
}
class Example1 
{
	public static void main(String[] args) 
	{
		Emp manager1=new Emp();
		manager1.setEmpId(1001);
		manager1.setEmpName("Tejaswini");
		
		int EmpId=manager1.getEmpId();
		String EmpName=manager1.getEmpName();
		System.out.println("Welcome onboard "+EmpName+", Your empId is "+EmpId);
	}
}
