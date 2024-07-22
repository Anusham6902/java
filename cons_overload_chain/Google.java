public class Google{
	public String user_Name;
	public String id;
	public boolean access;
	public int founded_Year;
	public byte age;
		public Google(){
		System.out.println("contain zero argument");
		System.out.println("------------------------");
	}
	
	public Google(String user_Name,String id,boolean access,int founded_Year,byte age){
		System.out.println("contain five argument");
		this.user_Name=user_Name;
		this.id=id;
		this.access=access;
		this.founded_Year=founded_Year;
		this.age=age;
		System.out.println("Name is:"+user_Name);
		System.out.println("Id is:"+id);
		System.out.println("Access:"+access);
		System.out.println("Founded year:"+founded_Year);
		System.out.println("Age is:"+age);
	}
}
