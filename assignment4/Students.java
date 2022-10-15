package assignment4;

public class Students
{
	public void getStudentInfo(int id)
	{
		System.out.println("id -"+id);
	}
		
		
	public void getStudentInfo(String name, String email)
	{
		System.out.println("Name -"+name+"\n"+"email address -"+email+"\n");
	}
	
	public void getStudentInfo(String phone_number,int mark,String rank)
	{
		System.out.println("Rank of student - "+rank+"\n"+"Student mark -"+mark+"\n"+"Phone number - "+phone_number);
	}
	public static void main(String[] args) 
	{
		Students stu1= new Students();
		stu1.getStudentInfo(150);
		System.out.println("------");
		
		stu1.getStudentInfo("test", "test@gmail.com");
		
		System.out.println("-------");
		stu1.getStudentInfo("7992458691",80,"firstclass");
	}
}
