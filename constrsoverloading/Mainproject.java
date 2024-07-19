public class Mainproject{

//instance variables
    public String name;
	public int cost;
	public boolean isRunning;
	public char logo;
	public float performance;
	public  String manager_name;
	public int no_of_programs;
	public boolean is_readable;
    public long codeline;
    public int users;


    public Mainproject(){
	System.out.println("No arguments");
} 

   public Mainproject(String name){
		System.out.println("Contain one arguments");
        this.name=name;
		System.out.println("Name is:"+name);

		System.out.println("--------------------------------------");		

   }
     public Mainproject(String name, int cost){
		System.out.println("Contain two arguments");
        this.name=name;
		this.cost=cost;
		System.out.println("Name is:"+name);
		System.out.println("Cost is:"+cost);
		System.out.println("--------------------------------------");		

   }
     public Mainproject(String name,int cost,boolean isRunning){
		System.out.println("Contain Three arguments");
        this.name=name;
		this.cost=cost;
		this.isRunning=isRunning;
		System.out.println("Name is:"+name);
		System.out.println("Cost is:"+cost);
		System.out.println("It is Running:"+isRunning);
		System.out.println("--------------------------------------");		


   }
     public Mainproject(String name,int cost,boolean isRunning,char logo){
		System.out.println("Contain four arguments");
        this.name=name;
		this.cost=cost;
		this.isRunning=isRunning;
		this.logo=logo;
		System.out.println("Name is:"+name);
		System.out.println("Cost is:"+cost);
		System.out.println("It is Running:"+isRunning);
		System.out.println("Logo is:"+logo);
		System.out.println("--------------------------------------");		



   }
     public Mainproject(String name,int cost,boolean isRunning,char logo,float performance){
		System.out.println("Contain five arguments");
        this.name=name;
		this.cost=cost;
		this.isRunning=isRunning;
		this.logo=logo;
		this.performance=performance;
		System.out.println("Name is:"+name);
		System.out.println("Cost is:"+cost);
		System.out.println("It is Running:"+isRunning);
		System.out.println("Logo is:"+logo);
		System.out.println("Performance is:"+performance);
		System.out.println("--------------------------------------");		



   }
     public Mainproject(String name,int cost,boolean isRunning,char logo,float performance,String manager_name){
		System.out.println("Contain six arguments");
        this.name=name;
		this.cost=cost;
		this.isRunning=isRunning;
		this.logo=logo;
		this.performance=performance;
		this.manager_name=manager_name;
		System.out.println("Name is:"+name);
		System.out.println("Cost is:"+cost);
		System.out.println("It is Running:"+isRunning);
		System.out.println("Logo is:"+logo);
		System.out.println("Performance is:"+performance);
		System.out.println("Manager name is:"+manager_name);
		System.out.println("--------------------------------------");		

		
}
public Mainproject(String name,int cost,boolean isRunning,char logo,float performance,String manager_name, int no_of_programs){
		System.out.println("Contain seven arguments");
        this.name=name;
		this.cost=cost;
		this.isRunning=isRunning;
		this.logo=logo;
		this.performance=performance;
		this.manager_name=manager_name;
		this.no_of_programs=no_of_programs;
		System.out.println("Name is:"+name);
		System.out.println("Cost is:"+cost);
		System.out.println("It is Running:"+isRunning);
		System.out.println("Logo is:"+logo);
		System.out.println("Performance is:"+performance);
		System.out.println("Manager name is:"+manager_name);
		System.out.println("No of programs:"+no_of_programs);
	
				 System.out.println("--------------------------------------");		

}
public Mainproject(String name,int cost,boolean isRunning,char logo,float performance,String manager_name, int no_of_programs,boolean is_readable){
		System.out.println("Contain eight arguments");
        this.name=name;
		this.cost=cost;
		this.isRunning=isRunning;
		this.logo=logo;
		this.performance=performance;
		this.manager_name=manager_name;
		this.no_of_programs=no_of_programs;
		this.is_readable=is_readable;
		System.out.println("Name is:"+name);
		System.out.println("Cost is:"+cost);
		System.out.println("It is Running:"+isRunning);
		System.out.println("Logo is:"+logo);
		System.out.println("Performance is:"+performance);
		System.out.println("Manager name is:"+manager_name);
		System.out.println("No of programs:"+no_of_programs);
		System.out.println("It is readable :"+is_readable);
		
				 System.out.println("--------------------------------------");		

}
		public Mainproject(String name,int cost,boolean isRunning,char logo,float performance,String manager_name, int no_of_programs,boolean is_readable,long codeline){
		System.out.println("Contain nine arguments");
        this.name=name;
		this.cost=cost;
		this.isRunning=isRunning;
		this.logo=logo;
		this.performance=performance;
		this.manager_name=manager_name;
		this.no_of_programs=no_of_programs;
		this.is_readable=is_readable;
		this.codeline=codeline; 
		System.out.println("Name is:"+name);
		System.out.println("Cost is:"+cost);
		System.out.println("It is Running:"+isRunning);
		System.out.println("Logo is:"+logo);
		System.out.println("Performance is:"+performance);
		System.out.println("Manager name is:"+manager_name);
		System.out.println("No of programs:"+no_of_programs);
		System.out.println("It is readable :"+is_readable);
		System.out.println("Codeline is:"+codeline);
		System.out.println("--------------------------------------");		

		}
		
		
		public Mainproject(String name,int cost,boolean isRunning,char logo,float performance,String manager_name, int no_of_programs,boolean is_readable,long codeline, int users){
		System.out.println("Contain nine arguments");
        this.name=name;
		this.cost=cost;
		this.isRunning=isRunning;
		this.logo=logo;
		this.performance=performance;
		this.manager_name=manager_name;
		this.no_of_programs=no_of_programs;
		this.is_readable=is_readable;
		this.codeline=codeline;  
		this.users=users;
		System.out.println("Name is:"+name);
		System.out.println("Cost is:"+cost);
		System.out.println("It is Running:"+isRunning);
		System.out.println("Logo is:"+logo);
		System.out.println("Performance is:"+performance);
		System.out.println("Manager name is:"+manager_name);
		System.out.println("No of programs:"+no_of_programs);
		System.out.println("It is readable :"+is_readable);
		System.out.println("Codeline is:"+codeline);
		System.out.println("Users are:"+users);
		System.out.println("--------------------------------------");		

		}
		
	
		
}